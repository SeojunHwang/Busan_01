package btc.service;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import btc.dto.ParmacyFullDataBodyDto;
import btc.dto.ParmacyFullDataDto;
import btc.dto.ParmacyFullDataItemDto;
import btc.dto.ParmacyFullDataItemsDto;

@Service
public class ParmacyFullDataServiceImpl implements ParmacyFullDataService {

	@Override
	public List<ParmacyFullDataItemDto> getParmacyFullDataItemList() throws Exception {
		
//		JAXBContext 객체 생성
		JAXBContext jc = JAXBContext.newInstance(ParmacyFullDataDto.class);
		
//		Unmarshaller 객체 생성
		Unmarshaller um = jc.createUnmarshaller();
		
//		xml 파일 로드 및 파싱 (xml의 전체 데이터가 java 객체로 생성됨)
//		unmarshal() 메서드를 실행하면 Java Object 타입으로 데이터를 반환함
		ParmacyFullDataDto fullData = (ParmacyFullDataDto)um.unmarshal(new File("C://java602//parmacylist.xml"));
		
//		Header이 가지고 있는 정보를 필요로 할 경우 사용
//		ParmacyFullDataHeaderDto header = fullData.getHeader();
		ParmacyFullDataBodyDto body = fullData.getBody();
		ParmacyFullDataItemsDto items = body.getItems();
		List<ParmacyFullDataItemDto> itemList = items.getItemList();
		
//		ParmacyFullDataDto 클래스 타입의 변수 fullData에서 한번에 itemList 가져오기
//		List<ParmacyFullDataItemDto> list = fullData.getBody().getItems().getItemList();
		
		return itemList;
	}
	
	@Override
	public List<ParmacyFullDataItemDto> getWebParmacyFullDataItemList(String strUrl) throws Exception {
		URL url = new URL(strUrl); // 받아온 주소로 접속 정보 설정
		HttpURLConnection urlConn = (HttpURLConnection)url.openConnection(); // url로 접속
		urlConn.setRequestMethod("GET");
		
		JAXBContext jc = JAXBContext.newInstance(ParmacyFullDataDto.class);
		Unmarshaller um = jc.createUnmarshaller();
		
//		접속된 서버의 xml 데이터를 받아와서 Java 객체로 변환
		ParmacyFullDataDto fullData = (ParmacyFullDataDto)um.unmarshal(url);
		List<ParmacyFullDataItemDto> itemList = fullData.getBody().getItems().getItemList();
		
		return itemList;
	}
}
