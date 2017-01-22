package org.soas.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.soas.domain.Boards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BoardsDAOImpl implements BoardsDAO {

	
	@Autowired
	private SqlSession session;
	
	private String namespace = "org.soas.BoardsMapper.";
	
	
	@Override
	public void create(Boards boards) throws Exception {
		
		session.insert(namespace + "create", boards);
	}

	
	@Override
	public Boards read(Integer board_idx) throws Exception {

		return session.selectOne(namespace + "read", board_idx);
	}

	
	@Override
	public void delete(Integer board_idx) throws Exception {

		session.delete(namespace + "delete", board_idx);
	}

	
	@Override
	public void update(Boards boards) throws Exception {

		session.update(namespace + "update", boards);
	}


	@Override
	public List<Boards> listAll(Integer page, Integer pageUnit) throws Exception {

		return session.selectList(namespace + "listAll", page);
	}


	@Override
	public Integer getAllCount() throws Exception {

		return session.selectOne(namespace + "getAllCount");
	}


	@Override
	public List<Boards> listSearch(Integer page, Integer pageUnit) throws Exception {

		return session.selectList(namespace + "listSearch", page);
	}


	@Override
	public Integer getSearchCount() throws Exception {

		return session.selectOne(namespace + "getSearchCount");
	}


	@Override
	public void upViewCount() throws Exception {

		session.update(namespace + "upViewCount");
	}

	@Override
	public void upReplyCount() throws Exception {

		session.update(namespace + "upReplyCount");
	}


	@Override
	public void downReplyCount() throws Exception {

		session.update(namespace + "downReplyCount");
	}

}
