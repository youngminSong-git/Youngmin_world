package package02;

public class Ex06 {
	static int idx;
	int goodsPrice;
	String goodsName;
	
	public Ex06(String goodsName, int goodsPrice) {
		idx++;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}
	
	public String getGoodsName() {
		return this.goodsName;
	}
	
	public int getGoodsPrice() {
		return this.goodsPrice;
	}
}
