package service.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import repository.GoodsRepository;

public class GoodsNumberService {
	//service : 데이터를 디비에 전달하거나 디비로 가져온 값을 model에 저장
	@Autowired
	GoodsRepository goodsRepository;
	public void goodsNum(Model model) {
		String goodsNum = goodsRepository.goodsNum();
		model.addAttribute("prodNum", goodsNum);
	}
}
