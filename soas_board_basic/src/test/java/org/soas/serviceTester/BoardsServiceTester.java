package org.soas.serviceTester;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.soas.domain.Boards;
import org.soas.service.BoardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardsServiceTester {


	@Autowired
	private BoardsService service;
	
	private Boards boards;
	
	
	@Before
	public void setup(){
		boards = new Boards();
	}
	
	@Test
	public void testRegist() throws Exception{
		
		boards.setUser_nickname("test nickname");
		boards.setBoard_title("test title");
		boards.setBoard_content("test content");
		
		service.regist(boards);
	}
	
	@Test
	public void testView() throws Exception{
		
		service.view(4);
	}
	
	@Test
	public void testRemove() throws Exception{
		
		service.remove(4);
	}
	
	@Test
	public void testModify() throws Exception{
		
		boards.setBoard_title("modify title");
		boards.setBoard_content("modify content");
		boards.setBoard_idx(3);
		
		service.modify(boards);
	}
	
	@Test
	public void testUpLikeCount() throws Exception{
		
		service.upLikeCount(3);
	}
	
	@Test
	public void testDownLikeCount() throws Exception{
		
		service.downLikeCount(3);
	}
}
