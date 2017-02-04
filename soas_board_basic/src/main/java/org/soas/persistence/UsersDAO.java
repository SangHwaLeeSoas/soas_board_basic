package org.soas.persistence;


import org.soas.domain.Users;

public interface UsersDAO {
	

	public void create(Users users);

	public Users read(String nickname);

	public void delete(String nickname);

	public void update(Users users);

	// Users list, search for admin version...
}
