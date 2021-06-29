package btc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="item")
@XmlAccessorType(XmlAccessType.FIELD)
public class Covid19ItemDto {
	@XmlElement(name="seq")
	private int seq;
	
	@XmlElement(name="accDefRate")
	private String accDefRate;
	
	@XmlElement(name="accExamCnt")
	private int accExamCnt;
	
	@XmlElement(name="accExamCompCnt")
	private int accExamCompCnt;
	
	@XmlElement(name="careCnt")
	private int careCnt;
	
	@XmlElement(name="clearCnt")
	private int clearCnt;
	
	@XmlElement(name="deathCnt")
	private int deathCnt;
	
	@XmlElement(name="decideCnt")
	private int decideCnt;
	
	@XmlElement(name="examCnt")
	private int examCnt;
	
	@XmlElement(name="resutlNegCnt")
	private int resutlNegCnt;
	
	@XmlElement(name="stateDt")
	private String stateDt;
	
	@XmlElement(name="stateTime")
	private String stateTime;
	
	@XmlElement(name="createDt")
	private String createDt;
	
	@XmlElement(name="updateDt")
	private String updateDt;
}
