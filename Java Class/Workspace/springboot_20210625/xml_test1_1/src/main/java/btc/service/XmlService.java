package btc.service;

import java.util.List;

import btc.dto.MemberDto;

public interface XmlService {
	List<MemberDto> getMemberList() throws Exception;
}
