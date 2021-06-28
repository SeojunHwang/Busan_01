package btc.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// @XmlRootElement : xml 데이터에서 부모가 되는 태그를 지정하는 어노테이션
// @XmlElement : xml 데이터에서 실제 데이터가 들어가 있는 태그를 지정하는 어노테이션
// @XmlAttribute : xml 데이터에서 지정한 태그의 속성을 지정하는 어노테이션
// @XmlAccessorType : xml 데이터와 자바 클래스와의 연동을 어떻게 지정할 것인지 설정하는 어노테이션
	// NONE : @XmlElement 로 설정된 filed와 properties 만 연동
	// FIELD : 모든 filed를 연동
	// PROPERTY : 모든 properties를 연동
	// PUBLIC_MEMBER : public 으로 지정된 fileds와 properties를 연동
// name 속성 : xml 데이터에서 해당 태그의 이름과 자바 클래스 및 멤버변수를 연동하기 위한 속성
@XmlRootElement(name="member")
public class MemberDto {
	private int no;
	private String id;
	private String name;
	private String gender;
	private String job;
	
	@XmlAttribute(name="no")
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	@XmlElement(name="id")
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement(name="name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="gender")
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@XmlElement(name="job")
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
}
