package org.soas.serviceTester;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.soas.domain.Users;
import org.soas.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class UsersServiceTester {


	@Autowired
	private UsersService service;
	
	private Users users;
	
	
	@Before
	public void setup(){
		users = new Users();
	}
	
	@Test
	public void testRegist() throws Exception{
		
		users.setUser_nickname("nick");
		users.setUser_id("test_id");
		users.setUser_pw("test_pw");
		users.setUser_email("test_email");
		
		service.regist(users);
	}
	
}
