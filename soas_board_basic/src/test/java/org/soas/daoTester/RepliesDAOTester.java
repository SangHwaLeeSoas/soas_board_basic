package org.soas.daoTester;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.soas.domain.Replies;
import org.soas.persistence.RepliesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class RepliesDAOTester {

	
	@Autowired
	private RepliesDAO dao;
	
	private Replies replies;
	
	@Before
	public void setup(){
		replies = new Replies();
	}
	
	
	@Test
	public void testCreate() throws Exception{
		
		replies.setBoard_idx(1);
		replies.setUser_nickname("test nick");
		replies.setReply_content("test content");
		
		dao.create(replies);
	}
	
	
	@Test
	public void testRead() throws Exception{
		
		dao.read(1);
	}
	
	
	@Test
	public void testDelete() throws Exception{
		
		dao.delete(1);
	}

	
	@Test
	public void testUpdate() throws Exception{
		
		replies.setReply_idx(2);
		replies.setReply_content("update content");
		
		dao.update(replies);
	}
	
	
	@Test
	public void testList_board_idx() throws Exception{
		
		dao.list_board_idx(1);
	}
	
}
