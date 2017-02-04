package org.soas.service;

import java.util.List;

import org.soas.domain.Images;
import org.soas.persistence.ImagesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagesServiceImpl implements ImagesService {

	
	@Autowired
	private ImagesDAO imagesDAO;
	
	
	@Override
	public void regist(Images images) {

		try {
			imagesDAO.create(images);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public Images view(Integer image_idx) {

		try {
			return imagesDAO.read(image_idx);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	public void remove(Integer image_idx) {

		try {
			imagesDAO.delete(image_idx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void modify(Images images) {

		try {
			imagesDAO.update(images);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<Images> list_boad_idx(Integer board_idx) {

		try {
			return imagesDAO.list_board_idx(board_idx);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
