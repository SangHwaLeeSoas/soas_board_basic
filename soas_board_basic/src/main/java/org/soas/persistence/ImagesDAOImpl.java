package org.soas.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.soas.domain.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImagesDAOImpl implements ImagesDAO{

	
	@Autowired
	SqlSession session;
	
	private String namespace = "org.soas.ImagesMapper.";
	
	
	@Override
	public void create(Images images) {
	
		session.insert(namespace + "create", images);
	}

	@Override
	public Images read(Integer image_idx) {

		return session.selectOne(namespace + "read", image_idx);
	}

	@Override
	public void delete(Integer image_idx) {

		session.delete(namespace + "delete", image_idx);
	}

	@Override
	public void update(Images images) {

		session.update(namespace + "update", images);
	}

	@Override
	public List<Images> list_board_idx(Integer board_idx) {

		return session.selectList(namespace + "list_board_idx", board_idx);
	}

}
