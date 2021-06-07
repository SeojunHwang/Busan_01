package com.btc.board1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Board1Controller {

	@RequestMapping("/test")
	public ModelAndView test() throws Exception {
		ModelAndView mv = new ModelAndView("/test");
		
		return mv;
	}
}
