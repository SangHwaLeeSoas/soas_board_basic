package org.soas.persistence;

import java.util.List;

import org.soas.domain.Replies;

public interface RepliesDAO {

	
	public void create(Replies replies) throws Exception;
	
	public Replies read(Integer reply_idx) throws Exception;
	
	public void delete(Integer reply_idx) throws Exception;
	
	public void update(Replies replies) throws Exception;
	
	public List<Replies> list_board_idx(Integer board_idx) throws Exception;
	
}
