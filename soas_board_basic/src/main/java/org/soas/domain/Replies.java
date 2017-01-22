package org.soas.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Replies {
	
	
	private Integer board_idx, reply_rno;
	private String user_nickname, reply_content;
	private Date reply_regdate, reply_updatedate;

}
