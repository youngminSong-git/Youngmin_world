package service.employee;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Model.AuthInfoDTO;
import Model.EmployeeDTO;
import repository.EmployeeRepository;

public class EmployeeDetailService {
	@Autowired
	EmployeeRepository employeeRepository;
	public void empInfo(HttpSession session, Model model) {
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("authInfo"); //session으로부터 내정보 받아오기.
		String empId = authInfo.getUserId();
		EmployeeDTO dto = employeeRepository.empDetail(empId);
		model.addAttribute("employeeCommand", dto);
	}
}
