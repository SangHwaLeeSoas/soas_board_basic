package org.soas.persistence;


import org.soas.domain.Users;

public interface UsersDAO {
	

	public void create(Users users) throws Exception;

	public Users read(String nickname) throws Exception;

	public void delete(String nickname) throws Exception;

	public void update(Users users) throws Exception;

	// Users list, search for admin version...
}
