package btc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="header")
@XmlAccessorType(XmlAccessType.FIELD)
public class Covid19HeaderDto {
	
	@XmlElement(name="resultCode")
	private String resultCode;
	@XmlElement(name="resultMsg")
	private String resultMsg;
}
