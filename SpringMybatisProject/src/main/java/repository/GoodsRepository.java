package repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.CartDTO;
import Model.GoodsDTO;
import Model.GoodsReviewsDTO;
import Model.OrderListDTO;
import Model.ProductCartDTO;
import Model.PurchaseDTO;
import Model.ReviewDTO;
import Model.paymentDTO;

public class GoodsRepository {
	@Autowired
	SqlSession sqlsession; //스프링jdc에 있는 session를 받아와야함
	String namespace = "mappers.goodsMapper";
	String statement;
	
	public void cartRemove(Map<String, Object> condition) {
		statement = namespace + ".cartRemove";
		sqlsession.delete(statement, condition);
	}
	public void cartProdDel(CartDTO dto) {
		statement = namespace + ".cartProdDel";
		sqlsession.delete(statement, dto);
	}
	
	public GoodsReviewsDTO goodsReviews(String prodNum) {
		System.out.println(prodNum);
		statement = namespace + ".goodsReviews";
		return sqlsession.selectOne(statement, prodNum);
	}
	
	public void reviewUpdate(ReviewDTO dto) {
		statement = namespace + ".reviewUpdate";
		sqlsession.update(statement, dto);
	}
	
	public ReviewDTO reviewInfo(ReviewDTO dto) {
		statement = namespace + "reviewInfo";
		return sqlsession.selectOne(statement, dto);
	}
	
	public void reviewWrite(ReviewDTO dto) {
		statement = namespace + ".reviewWrite";
		sqlsession.insert(statement, dto);
	}
	
	public void payment(paymentDTO dto) {
		statement = namespace + ".payment";
		sqlsession.insert(statement, dto);
	}
	public List<OrderListDTO> baseOrderList(String memId){
		statement = namespace + ".baseOrderList";
		return sqlsession.selectList(statement, memId);
	}
	public int purchaseListInsert(CartDTO dto) {
		statement = namespace + ".purchaseListInsert";
		return sqlsession.insert(statement, dto);
	}
	public void cartDelete(CartDTO dto) {
		statement = namespace + ".cartDelete";
		sqlsession.delete(statement, dto);
	}
	public void purchaseInsert(PurchaseDTO dto) {
		statement = namespace + ".purchaseInsert";
		sqlsession.insert(statement, dto);
	}
	public void goodsQtyDown(CartDTO dto) {
		statement = namespace + ".goodsQtyDown";
		sqlsession.update(statement, dto);
	}
	
	public ProductCartDTO cartList(CartDTO dto) {
		statement = namespace + ".cartList";
		return sqlsession.selectOne(statement, dto);
	}
	
	public List<String> memProdNum(String memId){
		statement = namespace + ".memProdNum";
		return sqlsession.selectList(statement, memId);
	}
	
	
	public int cartAdd(CartDTO dto) {
		statement = namespace + ".cartAdd";
		return sqlsession.insert(statement, dto);
	}
	
	public void goodsDel(String prodNum) {
		statement = namespace +".goodsDel";
		sqlsession.delete(statement, prodNum);
	}
	
	public void goodsUpdate(GoodsDTO dto) {
		statement = namespace + ".goodsUpdate";
		sqlsession.update(statement, dto);
	}
	
	public GoodsDTO goodsDetail(String prodNum) {
		statement = namespace + ".goodsDetail";
		return sqlsession.selectOne(statement, prodNum);
	}
	
	public List<GoodsDTO> goodsList(){
		statement = namespace + ".goodsList";
		return sqlsession.selectList(statement);
	}
	
	public void goodsWrite(GoodsDTO dto) {
		statement = namespace + ".goodsWrite";
		sqlsession.insert(statement, dto);
	}
	
	public String goodsNum() {
		statement = namespace + ".goodsNum";
		return sqlsession.selectOne(statement);
	
	}
}
