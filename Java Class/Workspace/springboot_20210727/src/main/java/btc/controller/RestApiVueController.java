package btc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import btc.dto.AxiosBoardDto;
import btc.service.VueBoardService;

@RestController
public class RestApiVueController {
	@Autowired
	private VueBoardService vbSevice;
	
	@RequestMapping(value="/vue/axiosBoardList", method=RequestMethod.GET)
	public Object vueSelectBoardList() throws Exception {
		List<AxiosBoardDto> dataList = vbSevice.vueSelectBoardList();
		
		return dataList;
	}
}
