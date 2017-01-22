package org.soas.persistence;

import java.util.List;

import org.soas.domain.Boards;

public interface BoardsDAO {

	
	public void create(Boards boards) throws Exception;

	public Boards read(Integer board_idx) throws Exception;

	public void delete(Integer board_idx) throws Exception;

	public void update(Boards boards) throws Exception;
	
	public List<Boards> listAll(Integer page, Integer pageUnit) throws Exception;
	
	public Integer getAllCount() throws Exception;
	
	public List<Boards> listSearch(Integer page, Integer pageUnit) throws Exception;
	
	public Integer getSearchCount() throws Exception;
	
	public void upViewCount() throws Exception;
	
	public void upReplyCount() throws Exception;

	public void downReplyCount() throws Exception;
}
