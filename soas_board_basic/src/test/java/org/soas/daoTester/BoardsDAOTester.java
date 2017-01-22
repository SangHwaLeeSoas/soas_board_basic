package org.soas.daoTester;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.soas.domain.Boards;
import org.soas.persistence.BoardsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.java.Log;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@Log
public class BoardsDAOTester {

	
	@Autowired
	BoardsDAO dao;

	Boards boards;
	
	@Before
	public void setup(){
		boards = new Boards();
	}
	
	@Test
	public void testCreate() throws Exception{
		boards.setUser_nickname("test_nickname");
		boards.setBoard_title("test_title");
		boards.setBoard_content("test_content");
		
		dao.create(boards);
	}
	
	@Test
	public void testRead() throws Exception{
		log.info(dao.read(1).toString());
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(1);
	}
	
	@Test
	public void testUpdate() throws Exception{
		boards.setBoard_title("update_title");
		boards.setBoard_content("update_content");
		boards.setBoard_idx(2);
		
		dao.update(boards);
	}
}
