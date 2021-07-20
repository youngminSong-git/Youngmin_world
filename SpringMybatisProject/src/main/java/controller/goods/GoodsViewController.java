package controller.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.goods.GoodsDetailService;
import service.goods.GoodsReviewsService;

@Controller
@RequestMapping("prod")
public class GoodsViewController {
	//url 직접접근 막기
	@Autowired
	GoodsReviewsService goodsReviewsService;
	
	@RequestMapping("goodsView")
	public String goodsView(
			//데이터 날아오게 해주기 -> prodNum에 해당되는것
			@RequestParam(value="prodNum") String prodNum, Model model) {
		goodsReviewsService.goodsReviews(prodNum, model);
		return "goods/goodsView";
	}
}
