package controller.employee;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Model.AuthInfoDTO;
import command.EmployeeCommand;
import service.employee.EmployeeDeleteService;
import service.employee.EmployeeInfoService;
import service.employee.EmployeeJoinService;
import service.employee.EmployeeListService;
import service.employee.EmployeeNumService;
import service.employee.EmployeeUpdateService;
import service.main.LoginService;
import validator.EmployeeCommandValidator;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	//멤버필드 대신 사용
	@Autowired
	EmployeeNumService employeeNumService;
	@Autowired
	EmployeeJoinService employeeJoinService;
	@Autowired
	EmployeeListService employeeListService;
	@Autowired
	EmployeeInfoService employeeInfoService;
	@Autowired
	EmployeeUpdateService employeeUpdateService;
	@Autowired
	EmployeeDeleteService employeeDeleteService;
	@Autowired
	LoginService loginService; 


	@RequestMapping("empDelete")
	public String empDelete(@RequestParam(value="empId") String empId) {
		employeeDeleteService.empDelete(empId);
		return "redirect:empList";
	}
	
	//empModify 맵핑 생성
	@RequestMapping(value= "empModifyOk", method=RequestMethod.POST)
	public String empModifyOk(EmployeeCommand employeeCommand) {
		//empModify에서 수정완료버튼 누르면 empList로 리다이렉팅
		employeeUpdateService.empUpdate(employeeCommand);
		return "redirect:empList";
	}
	
	@RequestMapping("empModify")
	public String empModify(@RequestParam(value="empId") String empId, Model model) {
		employeeInfoService.empInfo(empId, model);
		return "employee/employeeModify";
	}
	
	//empInfo 맵핑 생성
	@RequestMapping("empInfo")
	public String empInfo(@RequestParam(value="empId") String empId, Model model) {
		employeeInfoService.empInfo(empId, model);
		return "employee/employeeInfo";
	}
	
	//employeeList 맵핑 URL 생성
	@RequestMapping(value = "empList", method = RequestMethod.GET)
	public String empList(Model model,
		@RequestParam(value="page" , defaultValue = "1")Integer page) {
		employeeListService.empList(model, page);
		return "employee/employeeList";
	}
	
	//empRegist맵핑 URL 생성
	@RequestMapping(value = "empRegist", method = RequestMethod.GET) //""안에 하나만 써도 되나, 이렇게 사용해주면 get,post방식 설정 가능
	public String empRegist(Model model, EmployeeCommand employeeCommand) {
		employeeNumService.empNo(model, employeeCommand);
		return "employee/employeeForm";
	}
	
	//empJoin맵핑 URL 생성
	@RequestMapping(value = "empJoin", method = RequestMethod.POST)
	//일치하지 않을 시 에러문구 생성
	public String empJoin(EmployeeCommand employeeCommand, Errors errors, Model model) { // Errors -> 유효성검사(아이디/비밀번호 틀렸을시 틀렸다고 나오기)
		/* System.out.println("empJoin : " + employeeCommand.getEmpName()); */
		new EmployeeCommandValidator().validate(employeeCommand, errors); //employeeCommand를 타겟으로 에러실행
		if(errors.hasErrors()) {
			//에러가 발생했다면 employeeForm페이지로 넘겨라
			return "employee/employeeForm";
		}
		AuthInfoDTO authInfo = loginService.login(employeeCommand.getEmpUserId(), employeeCommand.getEmpPw());
		if(authInfo != null) {
			errors.rejectValue("empUserId", "duplicate");
			return "employee/employeeForm";
		}
		employeeJoinService.empInsert(employeeCommand);
		return "redirect:empList"; // empList로 리다이렉팅
	}
}
