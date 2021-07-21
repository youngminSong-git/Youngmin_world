package Model;

import java.util.List;

public class GoodsReviewsDTO {
	GoodsDTO goods;
	List<ReviewDTO> reviews;
	public GoodsDTO getGoods() {
		return goods;
	}
	public void setGoods(GoodsDTO goods) {
		this.goods = goods;
	}
	public List<ReviewDTO> getReviews() {
		return reviews;
	}
	public void setReviews(List<ReviewDTO> reviews) {
		this.reviews = reviews;
	}
	
	
}
