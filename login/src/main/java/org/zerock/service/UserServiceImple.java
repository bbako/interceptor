package org.zerock.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.UserVO;
import org.zerock.dto.LoginDTO;
import org.zerock.persistence.UserDAO;
@Service
public class UserServiceImple implements UserService{
	
	@Inject
	UserDAO dao;
	
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
	
		return dao.login(dto);
	}

	
	
	
}
