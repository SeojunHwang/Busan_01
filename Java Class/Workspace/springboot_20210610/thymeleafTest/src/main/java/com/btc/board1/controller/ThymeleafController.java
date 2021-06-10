package com.btc.board1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.btc.board1.dto.UserModelDto;

@Controller
public class ThymeleafController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("/index");
		
		UserModelDto user = new UserModelDto();
		user.setSeq(1);
		user.setUserId("testUser1");
		user.setUserName("홍길동");
		user.setEmail("hong@gmail.com");
		user.setPhone("01012345678");
		user.setGender("남성");
		user.setCreateDt("2021-06-10");
		
		mv.addObject("data", user);
		mv.addObject("name", "아이유");
		mv.addObject("job", "가수");
		
		return mv;
	}
}
