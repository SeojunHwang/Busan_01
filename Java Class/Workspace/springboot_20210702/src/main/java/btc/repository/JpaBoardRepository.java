package btc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import btc.entity.BoardEntity;
import btc.entity.BoardFileEntity;

// 스프링 데이터 JPA에서 제공하는 CrudRepository 인터페이스를 상속받음
public interface JpaBoardRepository extends CrudRepository<BoardEntity, Integer> {

//	게시글 번호를 정렬하여 전체 게시글을 조회
//	메서드 조합 규칙에 맞도록 메서드를 조합하여 추가하면 실행 시 메서드의 이름에 따라 쿼리가 자동 생성됨
	List<BoardEntity> findAllByOrderByBoardIdxDesc();
	
//	@Query 어노테이션을 사용하여 SQL 쿼리를 직접 정의할 수 있음
	@Query("SELECT file FROM BoardFileEntity file WHERE board_idx = :boardIdx AND idx = :idx")
	BoardFileEntity findBoardFile(@Param("boardIdx") int boardIdx, @Param("idx") int idx);
}

// 스프링 데이터 JPA 리포지토리 인터페이스는 Repository<T, ID> 인터페이스가 최상위에 있고 그 다음에 CrudRepository<T, ID> 인테페이스가 존재함
// CrudRepository를 상속받는 PagingAndSortingRepository<T, ID> 인터페이스가 존재함
// 마지막으로 PagingAndSortingRepository를 상속받는 JpaRepository<T, ID>가 존재함

// 최상위의 Repository인터페이스는 아무런 기능이 없음
// CrudRepository 인터페이스는 CRUD 기능을 기본적으로 제공함
// CRUD 에 해당하는 기능을 작성하지 않더라도 인터페이스에서 제공되는 기능을 바로 사용할 수 있음

// CrudRepository가 제공하는 기본 메서드
//<S extends T> S save(S entity) : 주어진 엔티티를 저장
//<S entends T Iterable<S> saveAll(Iterable<S> entities) : 주어진 엔티티 목록을 저장
//Option<T> findById(Id id) : 주어진 아이디로 식별된 엔티티를 반환
//boolean existsById(Id id) : 주어진 아이디로 식별된 엔티티가 존재하는지 확인
// Iterable<T> findAll() : 모든 엔티티를 반환
// Iterable<T> findAllById(Iterable<ID> ids) : 주어진 아이디 목록에 맞는 모든 엔티티를 목록을 반환
// long count() : 사용 가능한 엔티티의 개수를 반환
// void deleteById(Id id) : 주어진 아이디로 식별된 엔티티를 삭제
// void delete(T entity) : 주어진 엔티티를 삭제
// void deleteAll(Iterable<? extends T> entities) : 주어진 엔티티 목록으로 식별된 엔티티를 모두 삭제
// void deleteAll : 모든 엔티티를 삭제

// CrudRepository는 규칙에 맞게 메서드를 조합하여 추가하면 메서드의 이름에 따라 SQL 쿼리가 생성되며, 이러한 메서드를 쿼리 메서드라고 함
// 1. 쿼리 메서드는 find...By, read...By, query...By, count...By, get...By 로 시작해야 함
// 2. 첫번째 by 뒤에는 컬럼명으로 구성됨, 첫번째 By는 쿼리의 검색조건이 됨
// 3. 두개 이상의 속성을 조합하려면 And 키워드를 사용
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation  참조

// @Query 어노테이션은 쿼리 메서드가 복잡하거나 쿼리 메서드로 표현하기 힘들 경우 SQL 쿼리를 직접 작성하여 실행하는 방식
// 1. [ ?1 ] 으로 표현 : 숫자가 입력되는 순서대로 ?1, ?2, ?3 으로 쿼리문에 표현
	// 1.1 @Query 어노테이션 아래에 있는 메서드의 매개변수가 순서대로 ?1, ?2, ?3에 할당됨
// 2. [ :변수명 ] 으로 표현 : 변수이름은 @Param 어노테이션을 사용하여 메서드의 매개변수와 연동 됨
	// 2.1 ~~ board_idx = :boardIdx AND idx = :idx 라고 쿼리문에 입력했을 경우 메서드의 매개변수에 @Param("boardIdx") int boardIdx 을 사용하면 :boardIdx와 메서드의 @Param 어노테이션에 지정한 이름과 연동됨







