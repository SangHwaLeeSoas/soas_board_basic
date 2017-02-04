package org.soas.service;

import org.soas.domain.Boards;
import org.soas.persistence.BoardsDAO;
import org.soas.persistence.ImagesDAO;
import org.soas.persistence.RepliesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardsServiceImpl implements BoardsService {

	
	@Autowired
	private BoardsDAO boardsDAO;
	
	@Autowired
	private ImagesDAO imagesDAO;
	
	@Autowired
	private RepliesDAO repliesDAO;
	
	
	@Override
	public void regist(Boards boards) {

		try {
			boardsDAO.create(boards);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public Boards view(Integer board_idx) {

		try {
			return boardsDAO.read(board_idx);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@Override
	@Transactional
	public void remove(Integer board_idx) {

		try {
			boardsDAO.delete(board_idx);
			imagesDAO.delete_board_idx(board_idx);
			repliesDAO.delete_board_idx(board_idx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void modify(Boards boards) {

		try {
			boardsDAO.update(boards);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void upLikeCount(Integer board_idx) {

		try {
			boardsDAO.upLikeCount(board_idx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void downLikeCount(Integer board_idx) {

		try {
			boardsDAO.downLikeCount(board_idx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
