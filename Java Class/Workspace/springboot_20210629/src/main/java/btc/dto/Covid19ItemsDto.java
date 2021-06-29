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
public class Covid19ItemsDto {

	@XmlElement(name="item")
	private List<Covid19ItemDto> itemList;
}
