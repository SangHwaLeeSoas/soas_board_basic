package org.soas.service;

import java.util.List;

import org.soas.domain.Replies;

public interface RepliesService {

	
	public void regist(Replies replies);
	
	public Replies view(Integer reply_idx);
	
	public void remove(Replies replies);
	
	public void modify(Replies replies);
	
	public List<Replies> list_board_idx(Integer board_idx);
	
}
