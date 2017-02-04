package org.soas.service;

import java.util.List;

import org.soas.domain.Replies;
import org.soas.persistence.BoardsDAO;
import org.soas.persistence.RepliesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RepliesServiceImpl implements RepliesService {

	
	@Autowired
	private RepliesDAO repliesDAO;
	
	@Autowired
	private BoardsDAO boardsDAO;
	
	
	@Override
	@Transactional
	public void regist(Replies replies) {

		try {
			repliesDAO.create(replies);
			boardsDAO.upReplyCount(replies.getBoard_idx());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public Replies view(Integer reply_idx) {

		try {
			return repliesDAO.read(reply_idx);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	@Transactional
	public void remove(Replies replies) {

		try {
			repliesDAO.delete(replies);
			boardsDAO.downReplyCount(replies.getBoard_idx()); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void modify(Replies replies) {

		try {
			repliesDAO.update(replies);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public List<Replies> list_board_idx(Integer board_idx) {

		try {
			return repliesDAO.list_board_idx(board_idx);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
