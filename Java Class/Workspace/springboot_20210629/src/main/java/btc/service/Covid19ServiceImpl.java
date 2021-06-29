package btc.service;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import btc.dto.Covid19Dto;
import btc.dto.Covid19ItemDto;

@Service
public class Covid19ServiceImpl implements Covid19Service {

	@Override
	public List<Covid19ItemDto> getCovid19ItemList() throws Exception {
		JAXBContext jc = JAXBContext.newInstance(Covid19Dto.class);
		Unmarshaller um = jc.createUnmarshaller();
		
		Covid19Dto data = (Covid19Dto)um.unmarshal(new File("C:\\java602\\covid19.xml"));
		
		List<Covid19ItemDto> itemList = data.getBody().getItems().getItemList();
		
		return itemList;
	}
	
	@Override
	public List<Covid19ItemDto> getCovid19WebItemList() throws Exception {
//		정보 제공 서버 주소
		String endPoint = "http://openapi.data.go.kr/openapi/service/rest/Covid19/";
//		서비스 주소
		String serviceFunc = "getCovid19InfStateJson";
//		개인당 할당받은 서비스 이용 키
		String keyFunc = "?serviceKey=";
//		옵션, 출력된 결과 중 몇번째 페이지를 출력할 것인지에 대한 옵션
		String opt1 = "&pageNo=";
//		옵션, 출력된 결과 화면에 몇개의 결과를 출력할 것인지에 대한 옵션
		String opt2 = "&numOfRows=";
//		필수 옵션, 정보 시작일
		String opt3 = "&startCreateDt=";
//		필수 옵션, 정보 종료일
		String opt4 = "&endCreateDt=";
		
//		공공 데이터 포털에서 발급받은 개인키
		String serviceKey = "MQ8moCpDCqz42c3kxwz2LHfm%2BevXvXYOTYnrZjpLTYgYqArm4QD7hxWxCGM%2F24BBmgODLVMFUM6mAAH4XCFQcg%3D%3D";
//		매개변수로 받아와야 하는 부분
		String pageNo = "1";
		String numOfRows = "10";
		String startCreateDt = "20210620";
		String endCreateDt = "20210629";
		
		String serviceUrl = endPoint + serviceFunc + keyFunc + serviceKey + opt1 + pageNo + opt2 + numOfRows + opt3 + startCreateDt + opt4 + endCreateDt;
		
//		URL : URL을 추상화하여 만든 클래스,
//		final 클래스로 되어 있기 때문에 상속이 불가능함
		URL url = new URL(serviceUrl);
//		HttpURLConnection : java에서 직접 HTTP 통신을 진행하기 위한 클래스
//		http 프로토콜을 통해서 데이터를 주고 받는데 사용함
//		데이터의 타입이나 길이의 제한이 거의 없음
//		주로 미리 길이를 알지 못하는 스트리밍 데이터를 주고 받는데 사용함
//		다양한 HTTP 응답 코드에 해당하는 상수값을 미리 정의해 놓음
		HttpURLConnection urlConn = (HttpURLConnection)url.openConnection();
		urlConn.setRequestMethod("GET");
		
		JAXBContext jc = JAXBContext.newInstance(Covid19Dto.class);
		Unmarshaller um = jc.createUnmarshaller();
		
//		unmarshal 메서드의 매개변수로 URL 클래스의 객체를 사용 시 해당 url을 통해 전송된 xml 데이터를 언마샬하여 반환함
		Covid19Dto data = (Covid19Dto)um.unmarshal(url);
		List<Covid19ItemDto> itemList = data.getBody().getItems().getItemList();
		
		return itemList;
	}
	
	@Override
	public List<Covid19ItemDto> getCovid19WebItemList(String strUrl) throws Exception {
		URL url = new URL(strUrl);
		HttpURLConnection urlConn = (HttpURLConnection)url.openConnection();
		urlConn.setRequestMethod("GET");
		
		JAXBContext jc = JAXBContext.newInstance(Covid19Dto.class);
		Unmarshaller um = jc.createUnmarshaller();
		
		Covid19Dto data = (Covid19Dto)um.unmarshal(url);
		List<Covid19ItemDto> itemList = data.getBody().getItems().getItemList();
		
		return itemList;
	}
}







