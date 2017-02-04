package org.soas.persistence;

import java.util.List;

import org.soas.domain.Images;

public interface ImagesDAO {
	
	
	public void create(Images images);
	
	public Images read(Integer image_idx);
	
	public void delete(Integer image_idx);
	
	public void update(Images images);
	
	public List<Images> list_board_idx(Integer board_idx);
	
	public void delete_board_idx(Integer board_idx);

}
