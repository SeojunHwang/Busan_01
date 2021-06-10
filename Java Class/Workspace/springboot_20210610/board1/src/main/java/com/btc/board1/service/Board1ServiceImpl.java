package com.btc.board1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.board1.dto.Board1Dto;
import com.btc.board1.mapper.Board1Mapper;

// Board1Service 인터페이스를 구현하는 클래스
// Service 어노테이션은 해당 클래스가 Service 파일을 구현한 것임을 나타내는 어노테이션
// 내부에서 자바 로직을 처리하는데 사용함

// mapper 와 연결하여 데이터 베이스에 접근하여 CRUD작업을 진행함
@Service
public class Board1ServiceImpl implements Board1Service {

	@Autowired
	private Board1Mapper board1Mapper;
	
//	오버라이딩을 통해서 상속받은 메서드 selectBoardList()를 구현
	@Override
	public List<Board1Dto> selectBoardList() throws Exception {
		return board1Mapper.selectBoardList();
	}
	
//	오버라이딩을 통해서 상속받은 메서드 insertBoard()를 구현
//	Mapper 를 통해서 DB서버에 데이터를 저장
	@Override
	public void insertBoard(Board1Dto board) throws Exception {
		board1Mapper.insertBoard(board);
	}
	
//	오버라이딩을 통해서 상속받은 메서드 selectBoardDetail()를 구현
//	Mapper 를 통해서 DB서버에 있는 boardIdx 번호의 게시물의 모든 정보를 가져옴
	@Override
	public Board1Dto selectBoardDetail(int boardIdx) throws Exception {
		return board1Mapper.selectBoardDetail(boardIdx);
	}
	
//	오버라이딩을 통해서 상속받은 메서드 updateBoard()를 구현
//	Mapper 를 통해서 DB서버의 데이터를 사용자가 입력한 내용으로 수정
	@Override
	public void updateBoard(Board1Dto board) throws Exception {
		board1Mapper.updateBoard(board);
	}

	
//	오버라이딩을 통해서 상속받은 메서드 deleteBoard()를 구현
//	Mapper 를 통해서 DB서버의 데이터를 삭제
	@Override
	public void deleteBoard(int boardIdx) throws Exception {
		board1Mapper.deleteBoard(boardIdx);
	}
}










