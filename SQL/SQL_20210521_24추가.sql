-- MYSQL 사용 명령어

-- mysql 콘솔 접속 명령
-- mysql -u 사용자id -p

-- 다른 서버에 있는 mysql에 접속할 경우 사용
-- mysql -u 사용자id -p -h 접속주소

-- 다른 서버에 있는 mysql에 접속 시 port까지 설정하여 접속
-- mysql -u 사용자id -p -h 접속주소 -P 포트번호


-- 사용할 수 있는 DB 목록 확인
SHOW DATABASES;

-- 사용할 DB 지정
-- ex) USE DB명;
USE mysql;

-- 해당 DB에 포함된 table 목록 확인
SHOW TABLES;


-- 사용자 생성하기
-- ex) CREATE USER 사용자명;
-- ex) CREATE USER 사용자명@접속주소;
CREATE USER 'test1';
CREATE USER 'test2'@'localhost';


-- 사용자 생성 시 비밀번호 함께 생성하기
-- ex) CREATE USER '사용자명'@'접속주소' IDENTIFIED BY '비밀번호';
CREATE USER 'test3'@'localhost' IDENTIFIED BY 'asdf1234';

SELECT host, user, authentication_string FROM user;

-- 사용자 삭제하기
-- ex) DROP USER '사용자명';
-- ex) DROP USER '사용자명'@'접속주소';
DROP USER 'test1';
DROP USER 'test2'@'localhost';

-- 사용자 비밀번호 변경
-- ex) ALTER USER '사용자명'@'접속주소' IDENTIFIED WITH caching_sha2_password BY '변경할 비밀번호';
ALTER USER 'test3'@'localhost' IDENTIFIED WITH caching_sha2_password BY 'qwer1234';


-- 데이터 베이스 생성하기
-- ex) CREATE DATABASE db명;
-- ex) CREATE SCHEMA db명;
CREATE DATABASE testdb1;
CREATE SCHEMA testdb2;

SHOW DATABASES;
-- 데이터 베이스 생성 시 기본 문자셋 설정하기
-- MySql의 현재 기본 문자셋은 utf8md4 임
-- MySql과 동일한 DB인 MariaDB는 utf8mb4를 지원하지 않음
-- 구 버전의 MySql은 기본 문자셋인 Latin 이어서 한글을 표시할 수 없음
-- ex) CREATE DATABASE db명 DEFAULT CHARACTER SET 문자셋;
CREATE DATABASE testdb3 DEFAULT CHARACTER SET utf8;

-- 데이터 베이스 삭제하기
-- ex) DROP DATABASE db명;
DROP DATABASE testdb3;


-- 5월 24일 수업내용 --

-- 데이터 베이스 사용 권한 확인하기
-- 정확하게는 지정한 사용자가 가지고 있는 권한을 확인
-- ex) SHOW GRANTS for '사용자명'@'접속주소';

-- 데이터 베이스 권한 설정하기
-- db명.테이블명 을 사용하여 지정한 데이터베이스의 각각의 테이블마다 다른 형태의 권한을 설정할 수 있음
-- db명.* 을 사용하면 지정한 데이터 베이스의 모든 테이블을 사용
-- ex) GRANT ALL PRIVILEGES ON db명.테이블명 TO '사용자명'@'접속주소';
-- ex) GRANT ALL PRIVILEGES ON db명.* TO '사용자명'@'접속주소';

-- 데이터 베이스 권한 삭제하기
-- ex) REVOKE ALL PRIVILEGES ON db명.* FROM '사용자명'@'접속주소';
-- ex) REVOKE ALL ON db명.* FROM '사용자명'@'접속주소';


-- 데이터 베이스의 중요 SQL 명령어
-- DDL 은 DB툴을 사용하면 쉽게 사용할 수 있지만 DML 부분은 반드시 직접 SQL 쿼리를 사용할 수 있도록 익혀야함

-- SELECT : DML 이며 DB에 저장된 정보를 조회하는 명령어
-- UPDATE : DML 이며 DB에 저장된 정보를 수정하는 명령어
-- DELETE : DML 이며 DB에 저장된 정보를 삭제하는 명령어
-- INSERT : DML 이며 DB에 정보를 저장하는 명령어

-- CREATE DATABASE : DDL 이며 데이터 베이스를 생성하는 명령어
-- ALTER DATABASE : DDL 이며 생성된 데이터 베이스를 수정하는 명령어

-- CREATE TABLE : DDL 이며 데이터 테이블을 생성하는 명령어
-- ALTER TABLE : DDL 이며 데이터 테이블을 수정하는 명령어
-- DROP TABLE : DDL 이며 데이터 테이블을 삭제하는 명령어 (테이블의 내용만 삭제하는 TRUNCATE 명령도 존재)

-- CREATE INDEX : 데이터 베이스의 검색 속도를 높이기 위한 Index를 생성하는 명령어
-- DROP INDEX : 필요없는 index를 삭제하는 명령어

-- CREATE VIEW : 가상의 테이블인 View를 생성하는 명령어


-- 테이블 생성하기
-- ex) CREATE TABLE 테이블명 (
-- 컬럼명1 데이터타입 제약조건,
-- 컬럼명2 데이터타입 제약조건,
-- 컬럼명3 데이터타입 제약조건
-- 키 제약 조건 설정
-- );

CREATE TABLE address (
	id varchar(50),
    pw varchar(50),
    user_name varchar(50),
    email varchar(100)
);

-- 자주 사용하는 제약조건
-- PK : 기본키, PrimaryKey 라고 불리우며 해당 테이블에서 데이터를 구분하는 유일한 값을 가지는 키, 기본적으로 Unique와 NOT NULL 속성을 가지고 있음, 다른 테이블의 PK 를 참조하여 참조키로 사용할 수 있음
-- NN : Not Null 을 말하며 데이터가 없다는 의미, 문자열 ''혹은 공백문자 와는 다름
-- UQ : Unique 는 유일한 값을 가지는 속성, 참조키로 사용할 수 없음
-- AI : Auto Increment, 데이터 자동 증가, int 타입을 사용할 경우 사용 가능
-- DEFAULT : 해당 컬럼의 기본값 설정, 일반적으로 null이 설정되어 있음

-- 테이블 삭제하기
-- TRUNCATE 명령은 테이블 자체를 삭제하는 것이 아니라 해당 테이블의 내용만 삭제함
-- ex) DROP TABLE 테이블명;
-- ex) TRUNCATE TABLE 테이블명;
DROP TABLE person;
TRUNCATE TABLE person;


-- 테이블 수정하기
-- ALTER TABLE 명령에 컬럼을 추가할 경우 ADD, 컬럼을 수정할 경우 MODIFY COLUMN, 컬럼을 삭제할 경우 DROP COLUMN 명령이 추가됨
-- ex) ALTER TABLE 테이블명 ADD 컬럼명 데이터타입 제약조건;
-- ex) ALTER TABLE 테이블명 MODIFY COLUMN 컬럼명 수정할데이터타입 수정할제약조건;
-- ex) ALTER TABLE 테이블명 DROP COLUMN 컬럼명;
ALTER TABLE address ADD addr varchar(200);
ALTER TABLE address MODIFY COLUMN addr varchar(300);
ALTER TABLE address DROP COLUMN addr;


-- DML 사용하기

-- INSERT
-- DB에 데이터를 저장하는 명령어
-- 데이터 저장시 'INSERT INTO 테이블명' 이후의 컬럼명의 순서에 맞춰서 데이터도 순서대로 입력해야 함
	-- 컬럼명을 입력하는 순서를 사용자가 지정할 수 있음
    -- 변경된 컬럼 순서에 따라 데이터도 해당 순서에 맞게 입력해야 함
-- 데이터를 저장하려는 테이블의 모든 컬럼에 대응하는 데이터를 입력하는 경우 컬럼명을 무시해도 상관없음, 데이터가 입력되는 순서는 정확히 지켜야 함
-- VALUE는 데이터를 1개만 입력 시 사용, VALUES는 데이터를 1개 이상 입력 시 사용
-- ex1) INSERT INTO 테이블명 (컬럼명1, 컬럼명2, 컬럼명3, ...)
--     VALUE (데이터1, 데이터2, 데이터3, ...);
-- ex2) INSERT INTO 테이블명
--     VALUE (데이터1, 데이터2, 데이터3, ...);
-- ex3) INSERT INTO 테이블명 (컬럼명1, 컬럼명2, 컬럼명3, ...)
--     VALUES (데이터1, 데이터2, 데이터3, ...);
-- ex4) INSERT INTO 테이블명 (컬럼명1, 컬럼명2, 컬럼명3, ...)
--     VALUES (데이터1-1, 데이터1-2, 데이터1-3, ...),
--            (데이터2-1, 데이터2-2, 데이터2-3, ...),
--            (데이터3-1, 데이터3-2, 데이터3-3, ...);

-- UPDATE
-- DB에 저장된 데이터를 수정하는 명령어
-- WHERE 절을 사용하여 원하는 데이터를 검색하여 필요한 데이터만 수정
-- 만약 WHERE 절을 입력하지 않는다면 모든 데이터를 수정함
-- ex) UPDATE 테이블명 SET 수정할컬럼명1 = 수정할데이터, 수정할컬럼명2 = 수정할데이터2, ..
--     WHERE 검색 조건


-- DELETE
-- DB에 저장된 데이터를 삭제하는 명령어
-- WHERE 절을 사용하여 원하는 데이터를 검색하여 삭제
-- 만약 WHERE 절을 입력하지 않는다면 모든 데이터를 삭제함
-- ex) DELETE FROM 테이블명 WHERE 검색조건;


-- SELECT
-- DB에 저장된 데이터를 조회하여 가져오는데 사용하는 명령어
-- 컬럼명 대신 * 을 사용할 경우 해당 테이블의 모든 컬럼명을 출력함
-- ex) SELECT 조회할컬럼명1, 조회할컬럼명2, 조회할컬럼명3, ... FROM 조회할테이블명;
-- ex) SELECT 조회할컬럼명1, 조회할컬럼명2, 조회할컬럼명3, ... FROM 조회할테이블명 WHERE 검색조건;
SELECT * FROM employees;
SELECT * FROM employees WHERE gender = 'M';
SELECT emp_no, first_name, last_name, gender FROM employees;
SELECT emp_no, first_name, last_name, gender FROM employees WHERE gender = 'F';