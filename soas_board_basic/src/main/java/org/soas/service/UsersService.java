package org.soas.service;

import org.soas.domain.Users;

public interface UsersService {
	
	
	public void regist(Users users);
	
	public Users view(String nickname);
	
	public void remove(String nickname);
	
	public void modify(Users users);

}
