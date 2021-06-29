package btc.service;

import java.util.List;

import btc.dto.Covid19ItemDto;

public interface Covid19Service {
	List<Covid19ItemDto> getCovid19ItemList() throws Exception;
}
