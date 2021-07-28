package controller.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("Login")
	public String LoginPage() {
		return "main/login";
	}
	
	@RequestMapping("main")
	public String main() {
		return "main/main";
	}
}
