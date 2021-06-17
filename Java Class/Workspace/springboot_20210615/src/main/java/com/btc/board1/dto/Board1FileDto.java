package com.btc.board1.dto;

import lombok.Data;

@Data
public class Board1FileDto {
	private int idx;
	private int boardIdx;
	private String originalFileName;
	private String storedFilePath;
	private long fileSize;
}
