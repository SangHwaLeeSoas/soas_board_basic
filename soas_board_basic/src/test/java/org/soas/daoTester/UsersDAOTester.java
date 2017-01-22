package org.soas.daoTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.soas.domain.Users;
import org.soas.persistence.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.java.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@Log
public class UsersDAOTester {

	
	@Autowired
	private UsersDAO dao;
	
	private Users users;
	
	@Before
	public void setup(){
		users = new Users();
	}
	
	@Test
	public void testCreate() throws Exception{
		users.setUser_nickname("test_nickname1");
		users.setUser_id("test_id");
		users.setUser_pw("test_pw");
		users.setUser_email("test_email");
		//users.setUser_profile("test_profile");
		
		dao.create(users);
	}
	
	@Test
	public void testRead() throws Exception{
		log.info(dao.read("test_nickname").toString());
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete("test_nickname1");
	}
	
	@Test
	public void testUpdate() throws Exception{
		users.setUser_pw("update_password");
		users.setUser_email("update_email");
		users.setUser_profile("update_password");
		
		dao.update(users);
	}
}
