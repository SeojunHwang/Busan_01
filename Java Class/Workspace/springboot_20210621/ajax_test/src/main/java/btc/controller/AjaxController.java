package btc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import btc.dto.CalDto;

@Controller
public class AjaxController {

	@RequestMapping("/test")
	public String testPage() throws Exception {
		return "/test/test";
	}
	
//	동기화 : 전송 매체로 연결되는 두 장치 간에 데이터를 교환하기 위해 전송되는 비트들의 타이밍(전송율, 전송시간, 간격)이 송신측에 있어서 똑같아야 하기 때문에 송신측과 수신측이 정확히 송수신 하기 위해서 시간을 맞추는 것
	
//	동기식 전송 방식 : 송신측과 수신측 시스템이 통신 시 시차가 있을 경우 보내온 데이터를 잘못 해석할 가능성을 막기 위해 양뱡향 시차를 맞추어 수신자가 정확히 수신할 수 있는 기술
//	전송하는 데이터가 한 글자 단위가 아닌 미리 정해진 수만큼의 문자열 한 블럭으로 만들어 전송
//	데이터 블럭의 전후에 특정한 제어 정보를 삽입하여 정상적으로 전송이 되어있는지 확인
//	전송 효율 및 전송 속도가 빠름
//	별도의 채널로 클럭 신호를 보내서 동기화 함
	
//	비동기식 전송 방식 : 데이터를 전송할 때 하나의 문자를 나태내는 부호의 전후에 스타트비트와 스탑비트를 넣어서 블록의 동기화를 취해주는 방식
//	비트열을 전송하지 않을 경우 송수신기의 회선은 휴식상태로 있다가 데이터 전송 시 start 신호를 전송하고 수신측은 스타트 시간의 1/2 시간동안 대기하다가 start 상태를 감지하여 데이터를 수신
	
//	AJAX란 : Asynchronous Javascript And Xml의 줄임말로 javascript 라이브러리 중 하나임
//	XMLHttpRequest 객체를 이용하여 전체 페이지를 새로 고침하지 않고 웹 페이지의 일부의 데이터를 로드하는 기법임
//	Javascript를 사용하여 비동기 통신과 서버와의 XML 데이터를 직접 주고받는 기술
	
//	Ajax 를 사용하는 이유 : web에서 새로운 데이터를 서버에서 가져오기 위해서는 반드시 페이지 전체를 새로고침해야 함
//	ajax는 자바스크립트를 사용하여 서버와 데이터 전송을 진행하기 때문에 화면 전체를 새로고침할 필요가 없음
	
//	장점 :
//	웹페이지의 속도 향상
//	서버의 처리가 완료되기 전에 처리가 가능함
//	서버에서 데이터만 전송하면 되므로 코딩 양이 줄어듬
//	기존 웹에서 불가능한 다양한 UI를 가능하게 해줌
	
//	단점 :
//	히스토리 관리가 되지 않음
//	페이지 이동없는 통신으로 인하여 보안상의 문제가 발생할 수 있음
//	연속으로 데이터 요청 시 서버에 부하가 증가할 수 있음
//	XMLHttpRequest를 통해서 통신하는 경우 사용자에게 아무런 진행정보가 주어지지 않음
//	Ajax를 쓸 수 없는 브라우저에 대한 문제가 발생할 수 있음
//	Cross-Domain 문제로 인하여 다른 도메인과 통신이 불가능함
//	지원하는 문자셋이 한정되어 있음
	
//	javascript 기본 ajax 사용 방식은 사용이 힘들 수 있음
//	jquery의 ajax 라이브러리를 사용하여 ajax를 사용함
	
	@RequestMapping("/ajax/sync.do")
	public String syncPage() throws Exception {
		return "/ajax/sync";
	}
	
	@RequestMapping("/ajax/syncResult.do")
	public ModelAndView syncResultPage(CalDto cal) throws Exception {
		ModelAndView mv = new ModelAndView("/ajax/syncResult");
		
		cal.setResult(cal.getNum1() + cal.getNum2());
		mv.addObject("cal", cal);
		
		return mv;
	}
	
//	@RequestMapping : 어노테이션 @RequestMapping에 value 속성과 method 속성을 사용하여 값은 동일하지만 실제 실행은 다르게 동작 되도록 할 수 있음
//	RequestMethod의 GET, POST는 html 태그의 form 태그가 가지고 있는 method 속성을 GET/POST와 동일함
//	form태그의 method 속성값 중 get은 기본값이며, 웹브라우저의 주소창에 데이터를 싣어보내는 방식
//	post 는 페이지의 데이터를 암호화하여 전송하는 방식
	@RequestMapping(value="/ajax/ajaxTest", method=RequestMethod.GET)
	public String ajaxTestPage() throws Exception {
//		템플릿의 /ajax/ajaxText.html 파일과 연동
		return "/ajax/ajaxTest";
	}
	
//	@ResponseBody : 해당 어노테이션을 사용 시 반환되는 데이터가 뷰와 연동되지 않고 데이터 그자체를 클라이언트로 반환함
	@ResponseBody
//	ajax를 통해서 서버와 통신 시 type속성에 post를 사용하여 controller의 맵핑된 메서드의 RequestMethod.POST를 사용한 메서드와 연동함
//	CatDto 클래스 타입의 변수 cal에 사용자가 입력한 데이터가 저장되어 서버로 전송됨
	@RequestMapping(value="/ajax/ajaxTest", method=RequestMethod.POST)
	public Object ajaxTestResultPage(CalDto cal) throws Exception {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("num1", cal.getNum1());
		map.put("num2", cal.getNum2());
		map.put("result", cal.getNum1() + cal.getNum2());
		
		return map;
	}
}















