package com.bitc.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bitc.dto.SumDto;

@Controller
public class AjaxController {

	@RequestMapping("/")
	public String index() throws Exception {
		
		return "/index";
	}
	
	@RequestMapping("/calSum.do")
	public String sum() throws Exception {
		
		return "/sum";
	}
	
	@RequestMapping("/result.do")
	public ModelAndView result(SumDto item) throws Exception {
		ModelAndView mv = new ModelAndView("/result");
		
		item.setResult(item.getNum1() + item.getNum2());
		mv.addObject("data", item);
		
		return mv;
	}
	
	@RequestMapping(value="/ajaxTest.do", method=RequestMethod.GET)
	public String ajaxTest() throws Exception {
		return "/ajaxTest";
	}
	
	@ResponseBody
	@RequestMapping(value="/ajaxTestSum.do", method=RequestMethod.POST)
	public Object ajaxTextSum(SumDto item) throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("num1", item.getNum1());
		map.put("num2", item.getNum2());
		map.put("result", item.getNum1() + item.getNum2());
		
		return map;
	}
}












