package btc.service;

import java.util.List;

import btc.dto.ParmacyFullDataItemDto;

public interface ParmacyFullDataService {
	List<ParmacyFullDataItemDto> getParmacyFullDataItemList() throws Exception;
}
