package btc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import btc.dto.ParmacyFullDataItemDto;
import btc.service.ParmacyFullDataService;

@Controller
public class ParmacyController {
	
	@Autowired
	private ParmacyFullDataService pfdService;
	
	@RequestMapping("/")
	public String index() throws Exception {
		return "/index";
	}
	
	@RequestMapping("/xml/file/parmacyFullData.do")
	public ModelAndView getParmacyFullDataList() throws Exception {
		ModelAndView mv = new ModelAndView("/xml/file/parmacyFullDataList");
		
		List<ParmacyFullDataItemDto> itemList = pfdService.getParmacyFullDataItemList();
		mv.addObject("itemList", itemList);
		
		return mv;
	}
	
	@RequestMapping(value="/xml/web/pharmacyFullData", method=RequestMethod.GET)
	public String getPharmacyFullData() throws Exception {
		return "/xml/web/pharmacyFullDataList";
	}
	
	@ResponseBody
	@RequestMapping(value="/xml/web/pharmacyFullData", method=RequestMethod.POST)
	public Object getPharmacyFullData(@RequestParam Map<String, String> param) throws Exception {
//		서비스 주소
		String endPoint = "http://apis.data.go.kr/B552657/ErmctInsttInfoInqireService/";
		String serviceFunc = "getParmacyFullDown"; // 명령어 주소
		String keyFunc = "?serviceKey=";
		String opt1 = "&pageNo=";
		String opt2 = "&numOfRows=";
		
		String serviceKey = "MQ8moCpDCqz42c3kxwz2LHfm%2BevXvXYOTYnrZjpLTYgYqArm4QD7hxWxCGM%2F24BBmgODLVMFUM6mAAH4XCFQcg%3D%3D";
		// ajax로 전송된 매개변수
		String pageNo = param.get("pageNo");
		String numOfRows = param.get("numOfRows");
		
		// 서비스 주소 완성
		String serviceUrl = endPoint + serviceFunc + keyFunc + serviceKey + opt1 + pageNo + opt2 + numOfRows;
		
//		Service를 통해서 생성된 serviceUrl로 접속하여 데이터를 가져옴
//		ParmacyFullDataItemDto 클래스 타입의 리스트에 저장
		List<ParmacyFullDataItemDto> itemList = pfdService.getWebParmacyFullDataItemList(serviceUrl);
		
//		Ajax 통신을 통하여 클라이언트로 데이터를 전송
		return itemList;
	}
}
