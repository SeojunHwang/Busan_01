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
