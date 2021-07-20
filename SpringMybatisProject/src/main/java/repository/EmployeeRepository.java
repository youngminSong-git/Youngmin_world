package repository;

import java.sql.Statement;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.EmployeeDTO;

public class EmployeeRepository {
	@Autowired
	SqlSession sqlsession;
	String nameSpace = "mappers.employeeMapper";
	String statement;
	
	public EmployeeDTO empDetail(String empId) {
		statement = nameSpace + ".empDetail";
		return sqlsession.selectOne(statement, empId); //employeedto를 받아오기 위해선 sqlsession을 가지고와야함
	}
	
	public void empDelete(String empId) {
		statement = nameSpace + ".empDelete";
		int i = sqlsession.delete(statement, empId);
		System.out.println(i + "개가 삭제되었습니다.");
	}
	
	public void empUpdate(EmployeeDTO dto) {
		statement = nameSpace + ".empUpdate";
		int i = sqlsession.update(statement, dto);
		System.out.println(i + "개가 저장되었습니다.");
	}
	
	public EmployeeDTO empInfo(String empId) {
		statement = nameSpace + ".empInfo";
		return sqlsession.selectOne(statement, empId);
	}
	
	public List<EmployeeDTO> empList(){
		statement = nameSpace + ".empList";
		return sqlsession.selectList(statement);
	}
	
	public void empInsert(EmployeeDTO dto) {
		statement = nameSpace + ".empInsert";
		int i = sqlsession.insert(statement, dto);
		System.out.println(i + "개가 저장되었습니다.");
	}
	public String empNo() {
		statement = nameSpace + ".empNo";
		return sqlsession.selectOne(statement);
	}
}
