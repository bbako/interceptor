package org.zerock.persistence;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.zerock.domain.UserVO;
import org.zerock.dto.LoginDTO;
@Repository
public class UserDAOImpl implements UserDAO {

	@Inject
	private SqlSessionTemplate session;
	
	private static final String namespace = "org.zerock.mapper.UserMapper";
	
	
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		
		
		return session.selectOne(namespace+".login",dto);
	}

}
