package org.soas.persistence;


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
	public void create(Boards boards){
		
		try{
			session.insert(namespace + "create", boards);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public Boards read(Integer board_idx){

		try{
			return session.selectOne(namespace + "read", board_idx);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	public void delete(Integer board_idx){

		try{
			session.delete(namespace + "delete", board_idx);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void update(Boards boards){

		try{
			session.update(namespace + "update", boards);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void upViewCount(Integer board_idx){
		
		try{
			session.update(namespace + "upViewCount", board_idx);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void upReplyCount(Integer board_idx){

		try{
			session.update(namespace + "upReplyCount", board_idx);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void downReplyCount(Integer board_idx){

		try{
			session.update(namespace + "downReplyCount", board_idx);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void upLikeCount(Integer board_idx){
		
		try{
			session.update(namespace + "upLikeCount", board_idx);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void downLikeCount(Integer board_idx){
		
		try{
			session.update(namespace + "downLikeCount", board_idx);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


}
