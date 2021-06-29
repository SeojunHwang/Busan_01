package btc.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="items")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParmacyFullDataItemsDto {
	
	@XmlElement(name="item")
	private List<ParmacyFullDataItemDto> itemList;
}
