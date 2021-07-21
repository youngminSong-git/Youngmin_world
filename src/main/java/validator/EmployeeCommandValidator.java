package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import command.EmployeeCommand;

//서버단에서 유효성검사하는 페이지, 기존에는 자바스크립트로 처리했으나 서버단으로도 처리가능
public class EmployeeCommandValidator implements Validator {
	public boolean supports(Class<?> clazz) {
		return false;
	}
	public void validate(Object target, Errors errors) {
		EmployeeCommand employeeCommand =(EmployeeCommand)target;
		if(!employeeCommand.isEmpPwEqualsEmpPwCon()) {
			//패스워드가 일치하지 않았을 때 false, 일치하면 true
			errors.rejectValue("empPwCon", "nomatch");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeId", "required");//employeeId가 비어있다면 required메시지 출력
		ValidationUtils.rejectIfEmpty(errors, "empUserId", "required");
		ValidationUtils.rejectIfEmpty(errors, "empPw", "required");
		ValidationUtils.rejectIfEmpty(errors, "empPwCon", "required");
		ValidationUtils.rejectIfEmpty(errors, "empName", "required");
		ValidationUtils.rejectIfEmpty(errors, "hireDate", "required");
		ValidationUtils.rejectIfEmpty(errors, "jobId", "required");
		ValidationUtils.rejectIfEmpty(errors, "phNumber", "required");
		ValidationUtils.rejectIfEmpty(errors, "officeNumber", "required");
		ValidationUtils.rejectIfEmpty(errors, "email", "required");
		ValidationUtils.rejectIfEmpty(errors, "empAddress", "required");
	}
}
