package org.soas.service;

import java.util.List;

import org.soas.domain.Images;

public interface ImagesService {

	
	public void regist(Images images);
	
	public Images view(Integer image_idx);
	
	public void remove(Integer image_idx);
	
	public void modify(Images images);
	
	public List<Images> list_boad_idx(Integer board_idx);
	
}
