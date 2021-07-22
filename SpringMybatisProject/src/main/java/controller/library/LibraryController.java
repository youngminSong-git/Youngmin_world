package controller.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("lib")
public class LibraryController {
	@RequestMapping("libBoard")
	public String libList() {
		return "library/libList";
	}
	
	@RequestMapping("libRegist")
	public String libRegist() {
		return "library/libForm";
	}
}
