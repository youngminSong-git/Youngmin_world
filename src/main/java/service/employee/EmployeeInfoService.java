package service.employee;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Model.AuthInfoDTO;
import Model.EmployeeDTO;
import repository.EmployeeRepository;

public class EmployeeInfoService {
	@Autowired
	EmployeeRepository employeeRepository;
	public void empInfo(String empId, Model model) {
		EmployeeDTO dto = employeeRepository.empInfo(empId);
		model.addAttribute("emp", dto);
	}
	
	public void empInfo2(String empId, Model model) {
		HttpSession session = null;
		// TODO Auto-generated method stub
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("authInfo");
		String empId1 = authInfo.getUserId();
		EmployeeDTO dto = employeeRepository.empInfo(empId1);
		model.addAttribute("emp", dto);
	}
}
