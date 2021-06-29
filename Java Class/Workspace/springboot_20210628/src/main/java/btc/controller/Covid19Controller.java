package btc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import btc.dto.Covid19ItemDto;
import btc.service.Covid19Service;

@Controller
public class Covid19Controller {
	
	@Autowired
	private Covid19Service c19Service;

	@RequestMapping("/xml/file/covid19List")
	public ModelAndView getCovide19DataList() throws Exception {
		ModelAndView mv = new ModelAndView("/xml/file/covid19List");
		
		List<Covid19ItemDto> itemList = c19Service.getCovid19ItemList();
		mv.addObject("itemList", itemList);
		
		return mv;
	}
}
