package btc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import btc.dto.AreaDto;

@Controller
public class UIController {

	@RequestMapping("/ajax/ui/selectBox")
	public String selectBoxView() throws Exception {
		return "/ui/selectBox";
	}
	
	@ResponseBody
	@RequestMapping(value="/ajax/ui/selectBox1", method=RequestMethod.POST)
	public Object selectBox1Selected(AreaDto area) throws Exception {
		List<AreaDto> listArea = new ArrayList<AreaDto>();
		
		if (area.getAreaName().equals("서울")) {
			AreaDto a = new AreaDto();
			AreaDto b = new AreaDto();
			AreaDto c = new AreaDto();
			AreaDto d = new AreaDto();
			
			a.setAreaName("강북구");
			b.setAreaName("강서구");
			c.setAreaName("강남구");
			d.setAreaName("강동구");
			
			listArea.add(a);
			listArea.add(b);
			listArea.add(c);
			listArea.add(d);
		}
		else if (area.getAreaName().equals("대전")) {
			AreaDto a = new AreaDto();
			AreaDto b = new AreaDto();
			AreaDto c = new AreaDto();
			AreaDto d = new AreaDto();
			
			a.setAreaName("동구");
			b.setAreaName("서구");
			c.setAreaName("중구");
			d.setAreaName("유성구");
			
			listArea.add(a);
			listArea.add(b);
			listArea.add(c);
			listArea.add(d);
		}
		else if (area.getAreaName().equals("대구")) {
			AreaDto a = new AreaDto();
			AreaDto b = new AreaDto();
			AreaDto c = new AreaDto();
			AreaDto d = new AreaDto();
			
			a.setAreaName("북구");
			b.setAreaName("서구");
			c.setAreaName("남구");
			d.setAreaName("동구");
			
			listArea.add(a);
			listArea.add(b);
			listArea.add(c);
			listArea.add(d);
		}
		else if (area.getAreaName().equals("부산")) {
			AreaDto a = new AreaDto();
			AreaDto b = new AreaDto();
			AreaDto c = new AreaDto();
			AreaDto d = new AreaDto();
			
			a.setAreaName("동래구");
			b.setAreaName("부산진구");
			c.setAreaName("해운대구");
			d.setAreaName("수영구");
			
			listArea.add(a);
			listArea.add(b);
			listArea.add(c);
			listArea.add(d);
		}
		
		return listArea;
	}
	
	@ResponseBody
	@RequestMapping(value="/ajax/ui/selectBox3", method=RequestMethod.POST)
//	@RequestParam : 해당 어노테이션은 클라이언트에서 전송된 데이터의 파라미터 이름을 지정하는데 사용하는 어노테이션
	public Object selectBox3Selected(@RequestParam(value="areaName") String areaName) throws Exception {
		List<String> listArea = new ArrayList<String>();
		
		if (areaName.equals("서울")) {
			listArea.add("강북구");
			listArea.add("강서구");
			listArea.add("강남구");
			listArea.add("강동구");
		}
		else if (areaName.equals("대전")) {
			listArea.add("동구");
			listArea.add("서구");
			listArea.add("중구");
			listArea.add("유성구");
		}
		else if (areaName.equals("대구")) {
			listArea.add("북구");
			listArea.add("서구");
			listArea.add("남구");
			listArea.add("동구");
		}
		else if (areaName.equals("부산")) {
			listArea.add("부산진구");
			listArea.add("수영구");
			listArea.add("해운대구");
			listArea.add("동래구");
		}
		
		return listArea;
	}
	
	@RequestMapping("/ajax/ui/selectBox2")
	public String selectBoxView2() throws Exception {
		return "/ui/selectBox2";
	}
	
	@ResponseBody
	@RequestMapping(value="/ajax/ui/Categori1", method=RequestMethod.POST)
	public Object categori1Selected(@RequestParam(value="cate1") String cate1) throws Exception {
		List<String> listCate = new ArrayList<String>();
		
		if (cate1.equals("패션잡화")) {
			listCate.add("지갑");
			listCate.add("벨트");
			listCate.add("모자");
		}
		else if (cate1.equals("디지털가전")) {
			listCate.add("노트북");
			listCate.add("생활가전");
			listCate.add("휴대폰");
		}
		else if (cate1.equals("생활건강")) {
			listCate.add("공구");
			listCate.add("수집품");
			listCate.add("음반");
		}
		
		return listCate;
	}
	
	@ResponseBody
	@RequestMapping(value="/ajax/ui/Categori2", method=RequestMethod.POST)
	public Object categori2Selected(@RequestParam(value="cate2") String cate1) throws Exception {
		List<String> listCate = new ArrayList<String>();
		
		if (cate1.equals("지갑")) {
			listCate.add("머니클립");
			listCate.add("명함지갑");
		}
		else if (cate1.equals("벨트")) {
			listCate.add("여성벨트");
			listCate.add("남성벨트");
		}
		else if (cate1.equals("모자")) {
			listCate.add("스냅백");
			listCate.add("비니");
		}
		else if (cate1.equals("노트북")) {
			listCate.add("AMD");
			listCate.add("INTEL");
		}
		else if (cate1.equals("생활가전")) {
			listCate.add("노트북");
			listCate.add("생활가전");
		}
		else if (cate1.equals("휴대폰")) {
			listCate.add("노트북");
			listCate.add("생활가전");
		}
		else if (cate1.equals("공구")) {
			listCate.add("전동공구");
			listCate.add("수작업공구");
		}
		else if (cate1.equals("수집품")) {
			listCate.add("공예품");
			listCate.add("이색수집품");
		}
		else if (cate1.equals("음반")) {
			listCate.add("국내음반");
			listCate.add("해외음반");
		}
		
		return listCate;
	}
}








