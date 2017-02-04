package org.soas.serviceTester;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.soas.domain.Replies;
import org.soas.service.RepliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class RepliesServiceTester {


	@Autowired
	private RepliesService service;
	
	private Replies replies;
	
	
	@Before
	public void setup(){
		replies = new Replies();
	}
	
	@Test
	public void testRegist() throws Exception{
		
		replies.setBoard_idx(3);
		replies.setUser_nickname("nnnick");
		replies.setReply_content("nn");
		
		service.regist(replies);
	}
	
	@Test
	public void testView() throws Exception{
		
		service.view(9);
	}
	
	@Test
	public void testRemove() throws Exception{
		
		replies.setBoard_idx(3);
		replies.setReply_idx(12);
		
		service.remove(replies);
	}
	
	@Test
	public void testModify() throws Exception{
		
		replies.setReply_content("????");
		replies.setReply_idx(9);
		
		service.modify(replies);
	}
	
	@Test
	public void testList_board_idx() throws Exception{
		
		service.list_board_idx(3);
	}
}
