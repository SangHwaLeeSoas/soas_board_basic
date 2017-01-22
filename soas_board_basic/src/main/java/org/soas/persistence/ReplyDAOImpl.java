package org.soas.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.soas.domain.Replies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	
	@Autowired
	private SqlSession session;
	
	private String namespace = "org.soas.ReplyMapper";
	
	
	@Override
	public void create(Replies vo) throws Exception {

		session.insert(namespace + ".create", vo);
	}

	
	@Override
	public Replies read(Integer rno) throws Exception {

		return session.selectOne(namespace + ".read", rno);
	}
	

	@Override
	public void delete(Integer rno) throws Exception {

		session.delete(namespace + ".delete", rno);
	}

	
	@Override
	public void update(Replies vo) throws Exception {

		session.update(namespace + ".update", vo);
	}

	
	@Override
	public List<Replies> listAll(Integer page) throws Exception {

		return session.selectList(namespace + ".listAll", page);
	}

	
	@Override
	public Integer getAllCount() throws Exception {

		return session.selectOne(namespace + ".getAllCount");
	}

}
