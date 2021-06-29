package btc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class Covid19BodyDto {
	
	@XmlElement(name="items")
	private Covid19ItemsDto items;
	
	@XmlElement(name="pageNo")
	private int pageNo;
	
	@XmlElement(name="numOfRows")
	private int numOfRows;
	
	@XmlElement(name="totalCount")
    private int totalCount;
}
