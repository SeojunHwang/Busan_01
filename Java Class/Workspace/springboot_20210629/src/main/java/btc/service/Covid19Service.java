package btc.service;

import java.util.List;

import btc.dto.Covid19ItemDto;

public interface Covid19Service {
	List<Covid19ItemDto> getCovid19ItemList() throws Exception;
	
	List<Covid19ItemDto> getCovid19WebItemList() throws Exception;
	
	List<Covid19ItemDto> getCovid19WebItemList(String strUrl) throws Exception;
}
