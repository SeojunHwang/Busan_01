package btc.service;

import java.util.List;

import btc.dto.AxiosBoardDto;

public interface VueBoardService {
	List<AxiosBoardDto> vueSelectBoardList() throws Exception;
}
