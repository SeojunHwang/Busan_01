package btc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParmacyFullDataBodyDto {

	@XmlElement(name="items")
	private ParmacyFullDataItemsDto items;
	
	@XmlElement(name="pageNo")
	private int pageNo;
	
	@XmlElement(name="nomOfRows")
	private int numOfRows;
	
	@XmlElement(name="totalCount")
	private int totalCount;
}
