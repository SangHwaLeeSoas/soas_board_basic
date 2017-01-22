package org.soas.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageMaker {
	
	
	private Integer totalCount, startPage, endPage;
	private boolean prev, next;
	
	private PageVO vo;
	
	
	public void setPageVO(PageVO vo){	// ?
		this.vo = vo;
	}
	
	
	public void setTotalCount(Integer totalCount){
		this.totalCount = totalCount;
		
		calcPage();
	}
	
	
	private void calcPage(){
		
		endPage = (int)(Math.ceil(vo.getPage() / (double) vo.getPageUnit()) * vo.getPageUnit());
		
		startPage = (endPage - vo.getPageUnit()) + 1;
		
		int tempEndPage = (int) (Math.ceil(totalCount / (double)vo.getPageUnit()) * vo.getPageUnit());
		
		if(endPage < tempEndPage){
			endPage = tempEndPage;
		}
		
		prev = startPage == 1? false : true;
		
		next = endPage * vo.getPageUnit() >= totalCount? false : true; 
		
	}
	
	// makeAllUri, makeSearchUri....
	
	
}
