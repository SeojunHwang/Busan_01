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

import btc.dto.Covid19ItemDto;
import btc.service.Covid19Service;

@Controller
public class Covid19Controller {
	
	@Autowired
	private Covid19Service c19Service;

	@RequestMapping("/xml/file/covid19List")
	public ModelAndView getCovid19DataList() throws Exception {
		ModelAndView mv = new ModelAndView("/xml/file/covid19List");
		
		List<Covid19ItemDto> itemList = c19Service.getCovid19ItemList();
		mv.addObject("itemList", itemList);
		
		return mv;
	}
	
	@RequestMapping("/xml/web/covid19List")
	public ModelAndView getCovid19WebDataList() throws Exception {
		ModelAndView mv = new ModelAndView("/xml/web/covid19List");
		
		List<Covid19ItemDto> itemList = c19Service.getCovid19WebItemList();
		mv.addObject("itemList", itemList);
		
		return mv;
	}
	
	@RequestMapping(value="/xml/web/covid19AjaxList", method=RequestMethod.GET)
	public String getCovid19AjaxDataView() throws Exception {
		return "/xml/web/covid19AjaxList";
	}
	
	@ResponseBody
	@RequestMapping(value="/xml/web/covid19AjaxList", method=RequestMethod.POST)
	public Object getCovid19AjaxDataList(@RequestParam Map<String, String> param) throws Exception {
		String endPoint = "http://openapi.data.go.kr/openapi/service/rest/Covid19/";
		String serviceFunc = "getCovid19InfStateJson";
		String keyFunc = "?serviceKey=";
		String opt1 = "&pageNo=";
		String opt2 = "&numOfRows=";
		String opt3 = "&startCreateDt=";
		String opt4 = "&endCreateDt=";
		
		String serviceKey = "MQ8moCpDCqz42c3kxwz2LHfm%2BevXvXYOTYnrZjpLTYgYqArm4QD7hxWxCGM%2F24BBmgODLVMFUM6mAAH4XCFQcg%3D%3D";
		String pageNo = "1";
		String numOfRows = "10";
		
		String serviceUrl = endPoint + serviceFunc + keyFunc + serviceKey + opt1 + pageNo + opt2 + numOfRows + opt3 + param.get("startCreateDt") + opt4 + param.get("endCreateDt");
		
		List<Covid19ItemDto> itemList = c19Service.getCovid19WebItemList(serviceUrl);
		
		return itemList;
	}
	
//	문제 1) 전국 약국 정보를 Ajax를 사용하여 공공 데이터 포털에서 직접 데이터를 가져와서 화면에 출력하는 프로그램을 작성하세요
}









