package org.soas.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.soas.domain.Replies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepliesDAOImpl implements RepliesDAO {

	
	@Autowired
	private SqlSession session;
	
	private String namespace = "org.soas.RepliesMapper.";
	
	
	@Override
	public void create(Replies replies) throws Exception {

		try {
			session.insert(namespace + "create", replies);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public Replies read(Integer reply_idx) throws Exception {

		try {
			return session.selectOne(namespace + "read", reply_idx);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@Override
	public void delete(Integer reply_idx) throws Exception {

		try {
			session.delete(namespace + "delete", reply_idx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void update(Replies replies) throws Exception {

		try {
			session.update(namespace + "update", replies);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public List<Replies> list_board_idx(Integer board_idx) throws Exception {

		try {
			return session.selectList(namespace + "list_board_idx", board_idx);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
