package org.soas.service;

import org.soas.domain.Boards;

public interface BoardsService {

	
	public void regist(Boards boards);
	
	public Boards view(Integer board_idx);
	
	public void remove(Integer board_idx);
	
	public void modify(Boards boards);
	
	public void upLikeCount(Integer board_idx);
	
	public void downLikeCount(Integer board_idx);
	
}
