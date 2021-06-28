package btc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import btc.dto.MemberDto;
import btc.service.XmlService;

@Controller
public class XmlController {
	@Autowired
	private XmlService xmlService;
	
	@RequestMapping(value="/xml/file/xmlMemberFile", method=RequestMethod.GET)
	public ModelAndView xmlMemberFile() throws Exception {
		ModelAndView mv = new ModelAndView("/xml/file/xmlMemberFile");
		
		List<MemberDto> list = xmlService.getMemberList();
		mv.addObject("xmlDatas", list);
		
		return mv;
	}
}
