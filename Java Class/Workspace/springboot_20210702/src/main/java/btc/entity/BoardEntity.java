package btc.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

// @Entity 어노테이션은 해당 클래스가 JPA의 엔티티 임을 나타냄, 엔티티 클래스는 데이터 베이스의 테이블과 매핑됨
@Entity
// @Table 어노테이션은 name 속성에 지정된 테이블을 기반으로 데이터 베이스의 테이블과 매핑됨
@Table(name="t_jpa_board")
@NoArgsConstructor
@Data
public class BoardEntity {

//	@Id : 해당 엔티티의 기본키 임을 나타냄
	@Id
//	@GeneratedValue 어노테이션은 기본키의 생성 전략을 지정하는데 사용하는 어노테이션
//	GenerationType.AUTO로 설정 시 데이터 베이스의 기본키 생성 전략을 사용함
//	MySql은 자동 증가 옵션이 있으므로 자동으로 값이 증가하며, 오라클은 자동 증가 옵션이 없으므로 GenerationType.SEQUENCE로 설정하여야 값이 자동으로 증가함
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int boardIdx;
	
//	@Culumn 어노테이션은 컬럼의 속성을 설정하는데 사용
//	nullable=false 는 not null을 뜻함
	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false)
	private String contents;
	
	@Column(nullable=false)
//	해당 컬럼의 기본값을 설정
	private int hitCnt = 0;
	
	@Column(nullable=false)
	private String creatorId;
	
	@Column(nullable=false)
//	해당 컬럼의 기본값을 설정, 현재 시간으로 기본값을 설정
//	@Column 어노테이션을 사용하여 데이터베이스의 초기값을 설정해도 상관없지만 JPA는 특정 데이터베이스에 종속되는 명령어 사용을 하지 않는것이 좋음
	private LocalDateTime createdDate = LocalDateTime.now();
	
	private String updaterId;
	
	private LocalDateTime updatedDate;
	
//	@OneToMany 어노테이션은 1:N 관계를 표현하는 어노테이션
//	@JoinColumn 어노테이션은 테이블간의 관계가 있는 컬럼을 설정하는 어노테이션
//		@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//		@JoinColumn(name="board_idx")
//		private Collection<BoardFileEntity> fileList;
}



