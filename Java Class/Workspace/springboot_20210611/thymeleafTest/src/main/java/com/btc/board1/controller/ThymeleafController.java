package com.btc.board1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
		user.setSeq(0);
		user.setUserId("testUser1");
		user.setUserName("홍길동");
		user.setEmail("hong@gmail.com");
		user.setPhone("01012345678");
		user.setGender("남성");
		user.setCreateDt("2021-06-10");
		
		List<UserModelDto> userList = new ArrayList<UserModelDto>();
		for (int i = 0; i < 5; i++) {
			UserModelDto item = new UserModelDto();
			item.setSeq(i);
			item.setUserId("user0" + i);
			item.setUserName("테스터0" + i);
			item.setEmail("tester0" + i + "@gmail.com");
			item.setPhone("0101234123" + i);
			item.setGender("남성");
			item.setCreateDt("2021-06-11");
			
			userList.add(item);
		}
		
		mv.addObject("data", user);
		mv.addObject("name", "아이유");
		mv.addObject("job", "가수");
		mv.addObject("number", null);
		mv.addObject("dataList", userList);
		
		return mv;
	}
	
//	문제 1) 웹 브라우저에서 주소창에 서버 주소를 제외한 나머지 주소가 getUser 일 경우 getUser.html를 화면에 출력하는 controller를 생성하세요
//	* ModelAndView 를 사용하여 html 파일과 연동
//	* html 파일은 h1 태그를 사용하여 단순히 getUser 텍스트만 출력
	@RequestMapping("/getUser")
	public ModelAndView getUser() throws Exception {
		ModelAndView mv = new ModelAndView("/getUser");
		
		return mv;
	}
	
	@RequestMapping("/getUser2")
	public String getUser2() throws Exception {
		return "/getUser2";
	}
	
//	문제 2) 주소창에 userInfo 를 입력 시 userInfo.html 파일과 연동되는 controller 및 view를 생성하세요
//	userInfo가 있는 폴더는 users라는 폴더로 지정되어 있음
//	view로 전송한 user 정보는 dto를 사용하지 않고 직접 key와 데이터를 추가하는 방식으로 전송
//	view 화면은 부트스트랩을 사용
	@RequestMapping("/userInfo")
	public ModelAndView userInfo() throws Exception {
		ModelAndView mv = new ModelAndView("/users/userInfo");
		
		mv.addObject("name", "아이유");
		mv.addObject("job", "가수");
		mv.addObject("gender", "여성");
		mv.addObject("phone", "01012340987");
		
		return mv;
	}
	
//	문제 3) 주소창에 addressList 를 입력 시 html 파일 addrList를 연동하여 화면에 출력하는 controller 및 html을 생성하세요
//	controller에서 좋아하는 가수 정보를 5명 입력하여 view로 전송
//	가수 정보는 UserModelDto 클래스를 사용하여 데이터를 입력
//	view에서는 table로 가수 정보가 출력되야 함
//	화면은 부트스트랩을 사용
	@RequestMapping("/addressList")
	public ModelAndView addressList() throws Exception {
		ModelAndView mv = new ModelAndView("/addrList");
		
		List<UserModelDto> userList = new ArrayList<UserModelDto>();
		for (int i = 0; i < 5; i++) {
			userList.add(dataCreate(i));
		}
		
		mv.addObject("dataList", userList);
		
		return mv;
	}
	
	private UserModelDto dataCreate(int seq) {
		String[] names = {"아이유", "유인나", "정인선", "유재석", "조세호"};
		String[] ids = {"asdlkj", "slkj", "qoqiuwe", "sjue", "dddie"}; 
		String[] genders = {"남성", "여성"};
		
		Random rd = new Random();
		int rnd1 = rd.nextInt(5);
		int rnd2 = rd.nextInt(5);
		int rnd3 = rd.nextInt(2);
		
		UserModelDto user = new UserModelDto();
		user.setSeq(seq);
		user.setUserId(ids[rnd1]);
		user.setUserName(names[rnd2]);
		user.setGender(genders[rnd3]);
		user.setCreateDt("2021-06-11");
		
		return user;
	}
	
	@RequestMapping("/main")
	public String main() throws Exception {
		return "/main";
	}
	
	@RequestMapping("/main2")
	public String main2() throws Exception {
		return "/main2";
	}
	
}










