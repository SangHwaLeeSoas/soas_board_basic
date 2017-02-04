package org.soas.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.soas.domain.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImagesDAOImpl implements ImagesDAO{

	
	@Autowired
	private SqlSession session;
	
	private String namespace = "org.soas.ImagesMapper.";
	
	
	@Override
	public void create(Images images) {
	
		try {
			session.insert(namespace + "create", images);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public Images read(Integer image_idx) {

		try {
			return session.selectOne(namespace + "read", image_idx);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	public void delete(Integer image_idx) {

		try {
			session.delete(namespace + "delete", image_idx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void update(Images images) {

		try {
			session.update(namespace + "update", images);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public List<Images> list_board_idx(Integer board_idx) {

		try {
			return session.selectList(namespace + "list_board_idx", board_idx);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public void delete_board_idx(Integer board_idx) {

		try {
			session.delete(namespace + "delete_board_idx", board_idx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
