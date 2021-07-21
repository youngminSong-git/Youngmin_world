package service.goods;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Model.AuthInfoDTO;
import Model.CartDTO;
import Model.ProductCartDTO;
import repository.GoodsRepository;

public class GoodsCartListService {
	@Autowired
	GoodsRepository goodsRepository;
	public void cartList(HttpSession session, Model model) {
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("authInfo");
		String memId = authInfo.getUserId();
		//DTO에 있는 맴버가 1:1 관계인 경우 mybatis는 list로 값을 받아오지 못한다.
		List<String> prodNums = goodsRepository.memProdNum(memId);
		//사용자의 장바구니에 있는 상품번호
		List<ProductCartDTO> list = new ArrayList<ProductCartDTO>();
		
		for(String prodNum : prodNums) {
			CartDTO dto = new CartDTO();
			dto.setMemId(memId);
			dto.setProdNum(prodNum);
			ProductCartDTO productCartDTO = goodsRepository.cartList(dto);
			list.add(productCartDTO);
		}
		model.addAttribute("lists", list);
	}
}
