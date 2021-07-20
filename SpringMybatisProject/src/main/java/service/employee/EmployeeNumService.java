package service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.EmployeeCommand;
import repository.EmployeeRepository;

public class EmployeeNumService {
	@Autowired
	EmployeeRepository employeeRepository;
	public void empNo(Model model, EmployeeCommand employeeCommand) {
		String empNo = employeeRepository.empNo();
		System.out.println(empNo);
		employeeCommand.setEmployeeId(empNo);
		model.addAttribute("employeeCommand", employeeCommand);
	}
}