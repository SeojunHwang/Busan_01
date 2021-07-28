package btc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import btc.dto.BoardDto;
import btc.service.BoardService;

@Controller
public class VueController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/jquery/ajax")
	public String jqueryAjaxPage() throws Exception {
		return "/jquery/ajax";
	}
	
	@ResponseBody
	@RequestMapping(value="/jquery/ajax", method=RequestMethod.POST)
	public Object jqueryAjaxData() throws Exception {
		Map<String, String> data = new HashMap<String, String>();
		
		data.put("seq", "1");
		data.put("title", "vue.js");
		
		return data;
	}
	
	@ResponseBody
	@RequestMapping(value="/vue/axios", method=RequestMethod.POST)
	public Object vueAxiosData() throws Exception {
Map<String, String> data = new HashMap<String, String>();
		
		data.put("seq", "1");
		data.put("title", "vue.js");
		data.put("subTitle", "axios");
		
		return data;
	}
	
	@ResponseBody
	@RequestMapping(value="/vue/axiosBoardList", method=RequestMethod.POST)
	public Object vueSelectBoardList() throws Exception {
		List<BoardDto> dataList = boardService.selectBoardList();
		
		return dataList;
	}
	
	
//	axios를 통해서 데이터를 받아서 service를 이용하여 DB에 데이터 삽입
//	매개변수에 @RequestBody 어노테이션을 사용해야 정상적으로 클라이언트에서 전송한 데이터를 수신할 수 있음
	@RequestMapping(value="/vue/axiosInsertBoard", method=RequestMethod.POST)
	public void vueInsertBoard(@RequestBody BoardDto board) throws Exception {
		boardService.insertBoard(board);
	}
	
//	axios를 통해서 상세 글 번호를 받아서 service를 이용하여 DB에 저장된 글 내용을 하나 가져옴
	@ResponseBody
	@RequestMapping(value="/vue/axiosSelectBoardDetail", method=RequestMethod.POST)
	public Object vueSelectBoardDetail(@RequestBody BoardDto board) throws Exception {
		BoardDto data = boardService.selectBoardDetail(board.getBoardIdx());
		
		return data;
	}
	
	@ResponseBody
	@RequestMapping(value="/vue/axiosUpdateBoard", method=RequestMethod.POST)
	public Object vueUpdateBoard(@RequestBody BoardDto board) throws Exception {
		boardService.updateBoard(board);
		BoardDto data = boardService.selectBoardDetail(board.getBoardIdx());
		
		return data;
	}
	
	@RequestMapping(value="/vue/axiosDeleteBoard", method=RequestMethod.POST)
	public void vueDeleteBoard(@RequestBody BoardDto board) throws Exception {
		boardService.deleteBoard(board.getBoardIdx());
	}
}











