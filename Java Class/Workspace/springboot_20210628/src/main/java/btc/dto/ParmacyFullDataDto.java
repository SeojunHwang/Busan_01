package btc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="response")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParmacyFullDataDto {
	
	@XmlElement(name="header")
	private ParmacyFullDataHeaderDto header;
	
	@XmlElement(name="body")
	private ParmacyFullDataBodyDto body;
}
