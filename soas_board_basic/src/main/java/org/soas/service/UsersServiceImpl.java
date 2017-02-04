package org.soas.service;

import org.soas.domain.Users;
import org.soas.persistence.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService{

	
	@Autowired
	private UsersDAO usersDAO;

	// 회원 탈퇴시 BoardService.delete --> 적용...
	
	@Override
	public void regist(Users users) {

		try {
			usersDAO.create(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public Users view(String nickname) {

		try {
			return usersDAO.read(nickname);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	public void remove(String nickname) {

		try {
			usersDAO.delete(nickname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void modify(Users users) {

		try {
			usersDAO.update(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
}
