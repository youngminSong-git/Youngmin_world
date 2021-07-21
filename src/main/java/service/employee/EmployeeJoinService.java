package service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import Model.EmployeeDTO;
import command.EmployeeCommand;
import repository.EmployeeRepository;

public class EmployeeJoinService {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	BCryptPasswordEncoder bcryptPasswordEncoder;
	public void empInsert(EmployeeCommand employeeCommand) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmployeeId(employeeCommand.getEmployeeId());
		dto.setEmail(employeeCommand.getEmail());
		dto.setEmpAddress(employeeCommand.getEmpAddress());
		dto.setEmployeeId(employeeCommand.getEmployeeId());
		dto.setEmpName(employeeCommand.getEmpName());
		dto.setEmpPw(bcryptPasswordEncoder.encode(employeeCommand.getEmpPw())); //비밀번호 암호화
		dto.setEmpUserId(employeeCommand.getEmpUserId());
		dto.setHireDate(employeeCommand.getHireDate());
		dto.setJobId(employeeCommand.getJobId());
		dto.setOfficeNumber(employeeCommand.getJobId());
		dto.setPhNumber(employeeCommand.getPhNumber());
		employeeRepository.empInsert(dto);
	}
}
