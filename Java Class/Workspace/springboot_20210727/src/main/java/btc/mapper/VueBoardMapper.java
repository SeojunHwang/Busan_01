package btc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import btc.dto.AxiosBoardDto;

@Mapper
public interface VueBoardMapper {
	List<AxiosBoardDto> vueSelectBoardList() throws Exception;
}
