package org.soas.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchVO extends PageVO {
	
	
	private String searchType, keyword;
	private Integer page, total;
	

}
