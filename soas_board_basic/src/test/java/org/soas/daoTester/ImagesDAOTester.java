package org.soas.daoTester;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.soas.domain.Images;
import org.soas.persistence.ImagesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ImagesDAOTester {


	@Autowired
	ImagesDAO dao;
	
	Images images;
	
	@Before
	public void setup(){
		images = new Images();
	}
	
	@Test
	public void testCreate() throws Exception{
		
		images.setBoard_idx(1);
		images.setImage_name("test name");
		images.setImage_thumbnail("test thumbnail");
		
		dao.create(images);
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
		
		images.setImage_name("update name");
		images.setImage_thumbnail("update thumb");
		images.setImage_idx(2);
		
		dao.update(images);
		
	}
	
	@Test
	public void testList_board_idx() throws Exception{
		
		dao.list_board_idx(1);
	}
}
