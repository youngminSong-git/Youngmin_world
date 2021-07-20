package controller.employee;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.EmployeeCommand;
import service.employee.EmployeeDetailService;
import service.employee.EmployeeInfoService;
import service.employee.EmployeeModifyService;
import validator.EmployeeUpdateValidator;

@Controller
@RequestMapping("employee")
public class EmployeeMyPageController {
	@Autowired
	EmployeeInfoService employeeInfoService;
	@Autowired
	EmployeeModifyService employeeModifyService;
	@Autowired
	EmployeeDetailService employeeDetailService;
	
	@RequestMapping(value="empUpdateOk", method=RequestMethod.POST)
	public String empUpdateOk(EmployeeCommand employeeCommand, Errors error) {
		new EmployeeUpdateValidator().validate(employeeCommand, error);
		
		if(error.hasErrors()) {
			return "";
		}
		
		return "redirect:empInfo";
	}
	
	@RequestMapping("empupdate")
	public String empUpdate(HttpSession session, Model model) {
		employeeDetailService.empInfo(session, model);
		return "employee/empUpdate";
	}
	
	
	@RequestMapping("empInfo")
	public String empInfo(HttpSession session, Model model) {
		employeeDetailService.empInfo(session, model);
		return "employee/empDetail";
	}
	
	@RequestMapping("myPage")
	public String myPage() {
		return "employee/empMyPage";
	}
}
