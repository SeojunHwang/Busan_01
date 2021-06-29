package btc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="response")
@XmlAccessorType(XmlAccessType.FIELD)
public class Covid19Dto {

	@XmlElement(name="header")
	private Covid19HeaderDto header;
	
	@XmlElement(name="body")
	private Covid19BodyDto body;
}
