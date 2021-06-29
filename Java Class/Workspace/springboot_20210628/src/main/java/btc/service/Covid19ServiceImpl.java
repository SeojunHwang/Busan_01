package btc.service;

import java.io.File;
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

}
