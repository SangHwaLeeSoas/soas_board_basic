package org.soas.serviceTester;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.soas.domain.Images;
import org.soas.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ImagesServiceTester {


	@Autowired
	private ImagesService service;
	
	private Images images;
	
	
	@Before
	public void setup(){
		images = new Images();
	}
	
	@Test
	public void testRegist() throws Exception{
		
		images.setBoard_idx(4);
		images.setImage_name("name");
		images.setImage_thumbnail("thumb");
		
		service.regist(images);
	}
	
	@Test
	public void testView() throws Exception{
		
		service.view(11);
	}
	
	@Test
	public void testDelete() throws Exception{
		
		service.remove(11);
	}
	
	@Test
	public void testModify() throws Exception{
		
		images.setImage_name("momo");
		images.setImage_thumbnail("momoth");
		images.setImage_idx(11);
		service.modify(images);
	}
	
	@Test
	public void testList_board_idx() throws Exception{
		
		service.list_boad_idx(4);
	}

}
