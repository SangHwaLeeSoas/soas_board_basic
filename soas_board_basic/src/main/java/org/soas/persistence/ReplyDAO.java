package org.soas.persistence;

import java.util.List;

import org.soas.domain.Replies;

public interface ReplyDAO {

	
	public void create(Replies vo) throws Exception;
	
	public Replies read(Integer rno) throws Exception;
	
	public void delete(Integer rno) throws Exception;
	
	public void update(Replies vo) throws Exception;
	
	public List<Replies> listAll(Integer page) throws Exception;
	
	public Integer getAllCount() throws Exception;
	
	// reply.searchList 생략...
	
}
