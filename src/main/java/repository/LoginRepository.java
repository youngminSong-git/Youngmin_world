package repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.AuthInfoDTO;

public class LoginRepository {
	@Autowired
	SqlSession sqlsession;
	String namespace = "mappers.LoginMapper";
	String statement;
	public AuthInfoDTO login(String userId) {
		statement = namespace + ".Login";
		return sqlsession.selectOne(statement, userId);
	}
}
