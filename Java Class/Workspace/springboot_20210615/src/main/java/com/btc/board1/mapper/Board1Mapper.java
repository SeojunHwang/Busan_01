package com.btc.board1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.btc.board1.dto.Board1Dto;
import com.btc.board1.dto.Board1FileDto;

// @Mapper 어노테이션은 해당 파일이 xml 파일을 매핑해서 사용하는 파일임을 나타내는 어노테이션
// 해당 파일을 구현하는 xml 파일이 존재함을 의미
@Mapper
public interface Board1Mapper {
	List<Board1Dto> selectBoardList() throws Exception;
	
	void insertBoard(Board1Dto board) throws Exception;
	
	Board1Dto selectBoardDetail(int boardIdx) throws Exception;
	
	void updateBoard(Board1Dto board) throws Exception;
	
	void deleteBoard(int boardIdx) throws Exception;
	
	void insertBoardFileList(List<Board1FileDto> list) throws Exception;
}








