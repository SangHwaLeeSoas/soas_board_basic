package org.soas.persistence;

import java.util.List;

import org.soas.domain.Replies;

public interface RepliesDAO {

	
	public void create(Replies replies);
	
	public Replies read(Integer reply_idx);
	
	public void delete(Replies replies);
	
	public void update(Replies replies);
	
	public List<Replies> list_board_idx(Integer board_idx);
	
	public void delete_board_idx(Integer board_idx);
	
}
