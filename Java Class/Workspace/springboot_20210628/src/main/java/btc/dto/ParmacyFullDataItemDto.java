package btc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="item")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParmacyFullDataItemDto {
	
	@XmlElement(name="rnum")
	private int rNum;
	
	@XmlElement(name="hpid")
    private String hpId;
	
    @XmlElement(name="dutyName")
    private String dutyName;
    
    @XmlElement(name="dutyTel1")
    private String dutyTel1;
    
    @XmlElement(name="dutyAddr")
    private String dutyAddr;
    
    @XmlElement(name="dutyEtc")
    private String dutyEtc;
    
    @XmlElement(name="dutyInf")
    private String dutyInf;
    
    @XmlElement(name="dutyMapimg")
    private String dutyMapImg;
    
    @XmlElement(name="dutyTime1s")
    private String dutyTime1s;
    
    @XmlElement(name="dutyTime1c")
    private String dutyTime1c;
    
    @XmlElement(name="dutyTime2s")
    private String dutyTime2s;
    
    @XmlElement(name="dutyTime2c")
    private String dutyTime2c;
    
    @XmlElement(name="dutyTime3s")
    private String dutyTime3s;
    
    @XmlElement(name="dutyTime3c")
    private String dutyTime3c;
    
    @XmlElement(name="dutyTime4s")
    private String dutyTime4s;
    
    @XmlElement(name="dutyTime4c")
    private String dutyTime4c;
    
    @XmlElement(name="dutyTime5s")
    private String dutyTime5s;
    
    @XmlElement(name="dutyTime5c")
    private String dutyTime5c;
    
    @XmlElement(name="dutyTime6s")
    private String dutyTime6s;
    
    @XmlElement(name="dutyTime6c")
    private String dutyTime6c;
    
    @XmlElement(name="dutyTime7s")
    private String dutyTime7s;
    
    @XmlElement(name="dutyTime7c")
    private String dutyTime7c;
    
    @XmlElement(name="dutyTime8s")
    private String dutyTime8s;
    
    @XmlElement(name="dutyTime8c")
    private String dutyTime8c;
    
    @XmlElement(name="postCdn1")
    private int postCdn1;
    
    @XmlElement(name="postCdn2")
    private int postCdn2;
    
    @XmlElement(name="wgs84Lat")
    private String wgs84Lat;
    
    @XmlElement(name="wgs84Lon")
    private String wgs84Lon;
}
