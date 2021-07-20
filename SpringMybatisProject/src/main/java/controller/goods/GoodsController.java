package controller.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.GoodsCommand;
import service.goods.GoodsDeleteService;
import service.goods.GoodsDetailService;
import service.goods.GoodsListService;
import service.goods.GoodsNumberService;
import service.goods.GoodsUpdateService;
import service.goods.GoodsWriteService;
import validator.GoodsCommandValidate;

@Controller
@RequestMapping("goods") //반복되는 주소는 맨 위에 공통으로 적어놓으면 맵핑에 일일이 안넣어도 적용됨
public class GoodsController {
	@Autowired
	GoodsNumberService goodsNumberService; //멤버필드의 이름과 xml에 적어둔 bean의 class이름과 같아야함
	@Autowired
	GoodsWriteService goodsWriteService;
	@Autowired
	GoodsListService goodsListService;
	@Autowired
	GoodsDetailService goodsDetailService;
	@Autowired
	GoodsUpdateService goodsUpdateService;
	@Autowired
	GoodsDeleteService goodsDeleteService;
	
	
	@RequestMapping("goodsDel")
	public String goodsDel(@RequestParam(value="prodNum")String prodNum, HttpSession session) {
		goodsDeleteService.goodsDel(prodNum, session);
		return "redirect:goodsList";
	}
	
	@RequestMapping("goodsUpdate")
	//커맨드객체가 하는역할 : 파라미터에 저장
	//goodsUpdate페이지 맵핑생성 > 값을 커맨드에 저장 > 무사히 저장이 완료되면 goodsList로 리다이렉트 / 에러발생시 해당페이지에 머물기
	public String goodsUpdate(GoodsCommand goodsCommand,Errors errors, HttpSession session) {
		new GoodsCommandValidate().validate(goodsCommand, errors);
		if(errors.hasErrors()) {
			//에러가 생겼을때 리다이렉트 되지 않고 해당페이지에 머물기
			return "goods/goodsModify";
		}
		//커맨드가 가지고 있는 값을 리포시토리에 전달하기
		goodsUpdateService.goodsUpdate(goodsCommand, session);
		return "redirect:/goods/goodsList";
	}
	
	@RequestMapping("prodModify")
	public String prodModify(@RequestParam(value="prodNum") String prodNum, Model model) {
		goodsDetailService.goodsDetail(prodNum, model);
		return "goods/goodsModify";
	}
	
	@RequestMapping("prodDetail")
	public String prodDetail(@RequestParam(value="prodNum") String prodNum, Model model) {
		goodsDetailService.goodsDetail(prodNum, model);
		return "goods/goodsDetail";
	}
	
	@RequestMapping(value="goodsJoin", method=RequestMethod.POST)
	public String join(GoodsCommand goodsCommand, Errors errors, HttpSession session) {
		new GoodsCommandValidate().validate(goodsCommand, errors);
		if(errors.hasErrors()) {
			return "goods/goodsJoin";
		}
		goodsWriteService.goodsWrite(goodsCommand, session);
		return "redirect:goodsList";
	}
	
	//맵핑생성
	@RequestMapping("goodsList")
	public String list(Model model) {
		goodsListService.goodsList(model);
		return "goods/goodsList";
	}
	
	@RequestMapping("goodsRegist")
	public String regist(Model model) {
		goodsNumberService.goodsNum(model);
		return "goods/goodsJoin";
	}
}
