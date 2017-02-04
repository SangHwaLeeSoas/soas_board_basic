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

		try {
			session.insert(namespace + "create", users);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public Users read(String nickname) throws Exception {

		try {
			return session.selectOne(namespace + "read", nickname);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	public void delete(String nickname) throws Exception {

		try {
			session.delete(namespace + "delete", nickname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void update(Users users) throws Exception {

		try {
			session.update(namespace + "update", users);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
