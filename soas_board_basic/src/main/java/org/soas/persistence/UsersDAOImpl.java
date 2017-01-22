package org.soas.persistence;


import org.apache.ibatis.session.SqlSession;
import org.soas.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDAOImpl implements UsersDAO {

	
	@Autowired
	private SqlSession session;

	private String namespace = "org.soas.UsersMapper.";

	
	@Override
	public void create(Users users) throws Exception {

		session.insert(namespace + "create", users);
	}
	

	@Override
	public Users read(String nickname) throws Exception {

		return session.selectOne(namespace + "read", nickname);
	}

	
	@Override
	public void delete(String nickname) throws Exception {

		session.delete(namespace + "delete", nickname);
	}

	
	@Override
	public void update(Users users) throws Exception {

		session.update(namespace + "update", users);
	}


}
