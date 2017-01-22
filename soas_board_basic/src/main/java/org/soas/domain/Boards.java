 package org.soas.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Boards {
	
	
	private Integer board_idx, board_viewCount, board_replyCount, board_likeCount;
	private String user_nickname, board_title, board_content;
	private Date board_regdate, board_updatedate;
	
}
