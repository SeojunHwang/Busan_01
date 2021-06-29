package btc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
