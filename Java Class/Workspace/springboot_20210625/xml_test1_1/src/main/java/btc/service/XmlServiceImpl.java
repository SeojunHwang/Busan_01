package btc.service;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import btc.dto.MemberDto;
import btc.dto.MemberListDto;

@Service
public class XmlServiceImpl implements XmlService {

	@Override
	public List<MemberDto> getMemberList() throws Exception {
//		jaxb : 자바에서 xml 데이터를 파싱하도록 도와주는 라이브러리
//		Marshal(마샬) : 자바 클래스를 XML 데이터로 변환하는 작업
//		UnMarshal(언마샬) : XML 데이터를 자바 클래스로 변환하는 작업
		
//		JAXB 라이브러리 사용 선언
//		JAXB 라이브러리가 싱글톤 방식으로 디자인되어 있어 해당 객체를 사용하기 위해서 JAXBContext.newInstance() 를 실행하여 내부적으로 생성된 객체를 넘겨 받음
//		최상위 xml 태그와 연동되어 있는 자바 클래스를 JAXB 라이브러리의 객체와 연결
		JAXBContext jc = JAXBContext.newInstance(MemberListDto.class);
		
//		JAXB 라이브러리를 사용하여 XML 데이터를 자바 클래스 형태로 변환하는 언마샬 클래스의 사용 선언
//		JAXBContext 클래스 타입의 객체를 통해서 Unmarshaller 클래스 타입의 객체를 생성
		Unmarshaller um = jc.createUnmarshaller();
		
//		Unmarshaller 클래스타입의 변수 um을 통하여 unmarshal을 실행
//		File 클래스 타입의 객체를 통해서 실제 존재하는 xml 파일을 로드(xml 데이터 로드)
//		JAXB 라이브러리의 언마샬은 기본적으로 Object 클래스 타입으로 데이터를 반환
//		Object 클래스 타입의 데이터를 MemberListDto 클래스 타입으로 강제 타입 변환함
		MemberListDto memberList = (MemberListDto) um.unmarshal(new File("C://java602//memberlist.xml"));
//		MemberListDto 클래스 타입의 변수 memberList가 가지고 있는 List<MemberDto> 타입의 데이터를 getter를 통해서 반환
		List<MemberDto> list = memberList.getMemberList();
		
//		단순 데이터 확인용
//		for (MemberDto item : list) {
//			System.out.println("NO : " + item.getNo());
//			System.out.println("ID : " + item.getId());
//			System.out.println("Name : " + item.getName());
//			System.out.println("Gender : " + item.getGender());
//			System.out.println("Job : " + item.getJob());
//			System.out.println("----------------------------");
//		}
//		
		return list;
	}

}
