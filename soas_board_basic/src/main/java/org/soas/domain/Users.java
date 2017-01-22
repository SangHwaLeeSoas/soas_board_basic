package org.soas.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Users {
	
	
	private String user_nickname, user_id, user_pw, user_email, user_profile;
	private Date user_regdate, user_updatedate;
	
}
