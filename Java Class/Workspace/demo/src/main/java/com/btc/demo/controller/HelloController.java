package com.btc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Restful 컨트롤러 기능을 수행하도록 설정하는 어노테이션
@RestController
public class HelloController {
	
//	아래의 메서드를 지정한 URL과 연동하도록하는 어노테이션
	@RequestMapping("/")
	public String hello() { // RequestMapping 어노테이션과 연동되는 메서드
//		해당 메서드 동작 시 반환할 문자열
		return "Hello World!";
	}
	
	@RequestMapping("/hi")
	public String hi() {
		return "hi spring boot2";
	}
}
