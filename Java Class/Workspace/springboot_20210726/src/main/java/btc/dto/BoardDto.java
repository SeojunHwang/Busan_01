package btc.dto;

import lombok.Data;

@Data
public class BoardDto {
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String createdDate;
	private String creatorId;
	private String updatedDate;
	private String updaterId;
}
