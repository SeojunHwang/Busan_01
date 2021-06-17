package com.btc.board1.dto;

import lombok.Data;

// @Data 어노테이션은 lombok 라이브러리를 추가하여 사용하는 어노테이션으로 Dto 타입의 클래스를 생성 시 getter/setter를 직접 입력하지 않아도 자동으로 생성해주는 어노테이션임
@Data
public class UserModelDto {
	private int seq;
	private String userId;
	private String userName;
	private String email;
	private String phone;
	private String gender;
	private String createDt;
}
