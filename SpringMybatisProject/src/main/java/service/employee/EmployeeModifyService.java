package service.employee;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.Errors;

import Model.AuthInfoDTO;
import Model.EmployeeDTO;
import command.EmployeeCommand;
import repository.EmployeeRepository;

public class EmployeeModifyService {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	BCryptPasswordEncoder bcyptPasswordEncoder;
	public void empUpdate(HttpSession session, EmployeeCommand employeeCommand, Errors errors) {
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("authInfo");
		String empId = authInfo.getUserId();
		if(bcyptPasswordEncoder.matches(employeeCommand.getEmpPw(), authInfo.getUserPw())) {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmail(employeeCommand.getEmail());
			employeeDTO.setEmpAddress(employeeCommand.getEmpAddress());
			employeeDTO.setEmpName(employeeCommand.getEmpName());
			employeeDTO.setJobId(employeeCommand.getJobId());
			employeeDTO.setOfficeNumber(employeeCommand.getOfficeNumber());
			employeeDTO.setPhNumber(employeeCommand.getPhNumber());
			employeeDTO.setEmployeeId(empId);
			employeeRepository.empUpdate(employeeDTO);
		}else {
			errors.rejectValue("empPw", "notPw");
		}
	}
}
