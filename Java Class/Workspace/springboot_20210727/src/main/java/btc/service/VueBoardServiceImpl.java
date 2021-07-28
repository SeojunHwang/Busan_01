package btc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import btc.dto.AxiosBoardDto;
import btc.mapper.VueBoardMapper;

@Service
public class VueBoardServiceImpl implements VueBoardService {

	@Autowired
	private VueBoardMapper vbMapper;
	
	@Override
	public List<AxiosBoardDto> vueSelectBoardList() throws Exception {
		return vbMapper.vueSelectBoardList();
	}

}
