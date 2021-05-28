-- SELECT 문
-- DB에 저장된 데이터 중 사용자가 원하는 데이터만 조회하기 위한 명령어
-- WHERE 절과 함께 사용하여 원하는 데이터만 조회할 수 있음
-- WHERE 절과 함께 추가 명령어를 조합하여 필요한 데이터만 조회함
-- SELECT 뒤에 컬럼명을 입력하지 않고 * 을 사용 시 해당 테이블의 모든 컬럼을 출력
-- ex) SELECT 컬럼명1, 컬럼명2, 컬럼명3, ... FROM 조회할테이블명 WHERE 검색조건

SELECT * FROM employees;


-- DISTINCT
-- 데이터가 중복되어 출력될 경우 중복을 제거함
-- ex) SELECT DISTINCT 컬럼명1, 컬럼명2, ... FROM 테이블명;
SELECT * FROM titles;

SELECT title FROM titles; -- title 의 결과값이 중복되서 출력됨

SELECT DISTINCT title FROM titles; -- title의 결과값을 중복 제거함


-- WHERE
-- SELECT, UPDATE, DELETE 에서 사용자가 원하는 데이터를 검색하기 위해서 사용
-- WHERE 절에는 연산자를 사용할 수 있음
	-- 산술 연산자(+, -, *, /, %)
    -- 비교 연산자(=, >, <, >=, <=, <>(같지않다, !=))
    -- 비트 연산자(&, |, ^)
    -- AND, IN, LIKE, NOT, OR  (자주 사용 됨)
    -- ALL, ANY, BETWEEN, EXISTS, SOME (조금 활용도가 낮음)
-- ex) SELECT 컬럼명1, 컬럼명2, ... FROM 테이블명 WHERE 컬럼명 = 데이터;

SELECT * FROM employees;
SELECT * FROM employees WHERE emp_no = 10100;

SELECT * FROM employees WHERE hire_date = '1987-09-27';

SELECT * FROM employees WHERE birth_date = '1961-05-11';

SELECT * FROM employees WHERE hire_date < '1990-01-01';
SELECT * FROM employees WHERE hire_date > '1990-01-01';

-- 문제1) 사원정보 테이블에서 사원번호가 10100보다 빠른 사람들의 목록을 출력하세요
-- 출력할 정보는 사원번호, 이름, 성, 성별 만 출력
SELECT emp_no, first_name, last_name, gender FROM employees
WHERE emp_no < 10100;


-- AND, OR 연산자
-- 하나 이상의 조건을 검색할 경우 사용하는 연산자
-- AND 연산자를 사용하면 검색되는 결과수가 줄어듬
-- OR 연산자를 사용하면 검색되는 결과수가 늘어남 
-- ex) SELECT 컬럼명, ... FROM 테이블명 WHERE 조건1 AND 조건2 AND 조건3 ...;
-- ex) SELECT 컬럼명, ... FROM 테이블명 WHERE 조건1 OR 조건2 OR 조건3 ...;

SELECT * FROM employees WHERE emp_no < 10100 AND gender = 'F';
SELECT * FROM employees WHERE emp_no < 10100 AND gender = 'F' AND hire_date < '1990-01-01';

SELECT * FROM employees WHERE birth_date = '1952-06-13';
SELECT * FROM employees WHERE hire_date = '1990-05-05';
SELECT * FROM employees WHERE birth_date = '1952-06-13' OR hire_date = '1990-05-05';

-- 문제 2) 사원 정보 테이블에서 입사일이 1995년 5월 25일 이후로 입사한 사람 중 사원번호가 11000번 보다 크고 12000번 보다 작은 사람을 모두 검색해서 출력하세요
SELECT * FROM employees
WHERE hire_date > '1995-05-25'
AND emp_no > 11000
AND emp_no < 12000;

-- 문제 3) 사원 정보 테이블에서 이름이 'Mario'인 사람 중 생일이 1960년 이후인 사람을 검색하고, 입사일이 1990년 이전에 입사한 사람을 검색하세요
-- 사원 번호, 생일, 입사일, 이름, 성씨 만 출력
SELECT emp_no, birth_date, hire_date, first_name, last_name
FROM employees
WHERE first_name = 'Mario'
AND birth_date >= '1960-01-01'
AND hire_date < '1990-01-01';

-- NOT 연산자
-- 지정한 조건이 아닌 모든 결과를 출력하는 연산자
-- ex) SELECT 컬럼명 FROM 테이블명 WHERE NOT 검색조건;
SELECT emp_no, birth_date, hire_date, first_name, last_name
FROM employees
WHERE NOT first_name = 'Mario'
AND birth_date >= '1960-01-01'
AND hire_date < '1990-01-01';

-- 복잡한 조건을 사용 시 ()를 사용할 수 있음
SELECT * FROM employees WHERE first_name = 'Mario' OR first_name = 'Luigi';

SELECT * FROM employees WHERE emp_no < 11000 AND (first_name = 'Mario' OR first_name = 'Luigi');

SELECT * FROM employees WHERE emp_no < 11000 AND NOT (first_name = 'Mario' OR first_name = 'Luigi');


-- ORDER BY
-- 조회된 결과를 정렬하는 명령어
-- 정렬을 위한 키워드로 ASC(오름차순, 기본값), DESC(내림차순)
-- 정렬은 여러개를 동시에 정렬할 수 있지만 정렬하는 컬럼을 개수가 많아지면 원하는 형태로 정확히 정렬되지는 않음
-- ORDER BY 는 검색 조건이 아니고 정렬을 위한 명령어이기 때문에 AND 연산자를 사용하지 않음
-- ex) SELECT 컬럼명 FROM 테이블명 ORDER BY 컬럼명1, 컬럼명2, ..., ASC|DESC
SELECT * FROM employees;

SELECT * FROM employees ORDER BY emp_no DESC; -- 사원번호를 내림차순 정렬
SELECT * FROM employees ORDER BY first_name, last_name asc; -- 이름과 성씨를 오름차순으로 정렬

SELECT * FROM employees ORDER BY first_name ASC, last_name DESC;

SELECT * FROM employees WHERE birth_date < '1960-01-01' ORDER BY first_name DESC;

-- 문제 4) 입사일이 1990년 이후인 사람들 중 이름이 mario, luigi 이며, 사번이 11000 ~ 22000 인 사람을 검색하고 성씨를 오름차순으로 정렬, 이름을 내림차순으로 정렬하세요
SELECT * FROM employees
WHERE hire_date >= '1990-01-01'
AND (first_name = 'mario' OR first_name = 'luigi')
AND emp_no >= 11000
AND emp_no <= 22000
ORDER BY last_name ASC, first_name DESC;


-- NULL 이란?
-- 값이 존재하지 않는 필드
-- 테이블의 필드 제약조건에 Not Null 이 아닐 경우 데이터를 입력하지 않을 수 있음
-- 해당 경우에 NULL이 저장됨
-- NULL 은 공백문자나 빈 문자열(''), 숫자 0 과는 다른 개념임
-- 비교 연산자(=, <, >, <=, >=, <>) 로 NULL 값을 확인할 수 없음
-- NULL 을 확인하기 위한 연산자 IS NULL, IS NOT NULL 을 사용해야 함

SELECT * FROM address WHERE userName = NULL; -- null은 비교연산자 사용 불가

SELECT * FROM address WHERE userName IS NULL; -- NULL의 검색은 IS NULL
SELECT * FROM address WHERE userName IS NOT NULL; -- IS NOT NULL 로 가능


-- LIMIT
-- 조회 후 반환할 결과값의 수를 지정하는데 사용하는 명령어
-- LIMIT의 매개변수를 2개 사용 시 조회된 결과물 중에서 index(0부터 시작)를 사용하여 원하는 위치에서부터 원하는 개수를 결과값을 출력할 수 있음
-- ex) SELECT 컬럼명 FROM 테이블명 WHERE 검색조건 LIMIT 출력수;
-- ex) SELECT 컬럼명 FROM 테이블명 WHERE 검색조건 LIMIT 시작번호, 출력수;

SELECT * FROM employees;

SELECT * FROM employees LIMIT 10;
SELECT * FROM employees WHERE gender = 'M' LIMIT 5;
SELECT * FROM employees WHERE birth_date > '1965-01-01' LIMIT 10;

SELECT * FROM employees
WHERE birth_date > '1965-01-01'
LIMIT 20;

SELECT * FROM employees
WHERE birth_date > '1965-01-01'
LIMIT 10, 10;

-- 문제 5) 이름이 'luigi'이고 성별이 남자인 사람 중 가장 빨리 검색되는 사람 5명을 출력하세요
SELECT * FROM employees
WHERE first_name = 'Luigi'
AND gender = 'M'
LIMIT 5;

-- 문제 6) 이름이 'mario' 이거나 'luigi'인 사람 중 성별이 남자이고, 사원 번호가 15000 ~ 30000 사이이고, 입사일이 1985년 이후인 사람 중 6번째 이후의 사람 5명을 선택하여 출력하세요
SELECT * FROM employees
WHERE (first_name = 'mario' OR first_name = 'luigi')
AND gender = 'M'
AND emp_no >= 15000
AND emp_no <= 30000
AND hire_date >= '1985-01-01'
LIMIT 5, 5;


-- MIN(), MAX()
-- MIN() 선택한 컬럼의 가장 작은 값을 반환하는 함수
-- MAX() 선택한 컬럼의 가장 큰 값을 반환하는 함수
-- SELECT 구분에 입력하여 사용함
-- ex) SELECT MIN(컬럼명), 컬럼명1, ... FROM 테이블명 WHERE 검색조건;
-- ex) SELECT MAX(컬럼명), 컬럼명1, ... FROM 테이블명 WHERE 검색조건;
SELECT MIN(emp_no) FROM employees;
SELECT MAX(emp_no) FROM employees;
SELECT MIN(birth_date) FROM employees;
SELECT MAX(birth_date) FROM employees;
SELECT MIN(hire_date) FROM employees;
SELECT MAX(hire_date) FROM employees;


-- COUNT(), AVG(), SUM()
-- SELECT 절에 사용하는 함수
-- COUNT() 지정된 기준과 일치하는 행의 수를 반환하는 함수
-- AVG() 해당 컬럼의 평균값을 반환하는 함수
-- SUM() 해당 컬럼의 총합을 반환하는 함수
-- NULL값은 무시됨
-- ex) SELECT COUNT(컬럼명) FROM 테이블명
-- ex) SELECT AVG(컬럼명) FROM 테이블명
-- ex) SELECT SUM(컬럼명) FROM 테이블명
SELECT * FROM titles;
SELECT title, COUNT(title) FROM titles WHERE title = 'Assistant Engineer';

SELECT * FROM salaries;
SELECT * FROM salaries WHERE emp_no = 10009;

SELECT emp_no, AVG(salary) FROM salaries WHERE emp_no = 10009;

SELECT emp_no, SUM(salary) FROM salaries WHERE emp_no = 10009;


-- LIKE
-- 검색 조건을 입력 시 특정 패턴을 검색하는 명령어
-- 와일드카드문자(%, _) 와 함께 사용해야 함
	-- % : 0개 이상의 여러개의 문자
    -- _ : 1개의 단일 문자
-- ex) SELECT 컬럼명 FROM 테이블명 WHERE 컬럼명 LIKE 검색패턴;
SELECT * FROM employees WHERE first_name = 'mario';

SELECT * FROM employees WHERE first_name LIKE 'mar%';
SELECT * FROM employees WHERE first_name LIKE '%io';
SELECT * FROM employees WHERE first_name LIKE '%ri%';
SELECT * FROM employees WHERE first_name LIKE '%r%i%';

SELECT * FROM employees WHERE first_name LIKE '_ario';
SELECT * FROM employees WHERE first_name LIKE '__rio';
SELECT * FROM employees WHERE first_name LIKE 'ma___';
SELECT * FROM employees WHERE first_name LIKE '__ri_';
SELECT * FROM employees WHERE first_name LIKE '_a_i_';
SELECT * FROM employees WHERE first_name LIKE '_____';

SELECT * FROM employees WHERE first_name LIKE '%__e__%';


-- 문제 7) 사원 중 이름의 시작 글자가 ja 이고, 알파벳을 글자 길이가 4자 이상인 사람을 모두 검색하세요
SELECT * FROM employees WHERE first_name LIKE 'ja__%';

-- 문제 8) 사원의 이름이 ma 로 시작하고 사번이 30000번 이하인 사람 중 성별이 여자인 사람을 모두 출력하세요
SELECT * FROM employees
WHERE gender = 'F'
AND emp_no <= 30000
AND first_name LIKE 'ma%';

-- 문제 9) 입사일이 1990년 이후이며, 성별은 남자이고, 이름에 사용된 알파벳이 de 인 사람을 모두 출력하세요
SELECT * FROM employees
WHERE hire_date >= '1990-01-01'
AND gender = 'M'
AND first_name LIKE '%de%';


-- BETWEEN
-- 범위를 지정하는 연산자
-- AND, <, >, <=, >= 를 사용하여 동일한 결과값을 얻을 수 있음
-- 문자, 숫자, 날짜 도 사용이 가능함
-- ex) SELECT 컬럼명 FROM 테이블명 WHERE 컬럼명 BETWEEN 시작값 AND 종료값;
SELECT * FROM employees WHERE emp_no BETWEEN 10100 AND 10200;
SELECT * FROM employees WHERE emp_no >= 10100 AND emp_no <= 10200;

-- NOT 키워드를 사용하면 해당 범위 이외의 데이터를 출력
SELECT * FROM employees WHERE emp_no NOT BETWEEN 10100 AND 10200;


-- IN 연산자
-- 여러가지 값을 지정할 수 있는 연산자
-- OR 와 동일한 결과값을 출력할 수 있음
-- IN 연산자 사용 시 쿼리문 안의 쿼리문을 실행할 수 있음
-- NOT 와 함께 사용 시 반대의 결과를 얻을 수 있음
-- ex) SELECT 컬럼명 FROM 테이블명 WHERE 컬럼명 IN (값1, 값2, 값3, ...);
-- ex) SELECT 컬럼명 FROM 테이블명 WHERE 컬럼명 IN (SELECT 쿼리문);
SELECT * FROM employees WHERE first_name = 'mario' OR first_name = 'luigi';

SELECT * FROM employees WHERE first_name IN ('mario', 'luigi');
SELECT * FROM employees WHERE first_name NOT IN ('mario', 'luigi');


-- 문제 10) 사원 이름이 'parto', 'luigi', 'mary', 'berni' 인 사람을 모두 출력하세요
-- or문을 사용하여 출력, in을 사용하여 출력
SELECT * FROM employees WHERE first_name = 'parto'
OR first_name = 'luigi' OR first_name = 'mary' OR first_name = 'berni';
SELECT * FROM employees
WHERE first_name IN ('parto', 'luigi', 'mary', 'berni');

-- 문제 11) 사원 번호가 10100 ~ 10200 인 사람 중에서 사원 번호가 10101, 10110, 10111인 사람의 이름, 성씨, 성별, 입사입을 출력하세요
SELECT first_name, last_name, gender, hire_date FROM employees
WHERE emp_no BETWEEN 10100 AND 10200
AND emp_no IN (10101, 10110, 10111);

-- 문제 12) 사원 번호가 10100 ~ 10200 인 사람 중에서 사원 번호가 10101, 10110, 10111인 사람을 제외하고 사번, 이름, 성씨, 성별을 출력하세요
-- 출력되는 결과는 11번째부터 5명만 출력
SELECT emp_no, first_name, last_name, gender FROM employees
WHERE emp_no BETWEEN 10100 AND 10200
AND emp_no NOT IN (10101, 10110, 10111)
LIMIT 10, 5;



-- Aliases
-- 컬럼명 및 테이블명을 임시로 변경해서 사용하도록하는 명령어
-- JOIN 을 사용할 경우 테이블명과 컬럼명을 동시에 입력해야 하기 때문에 컬럼명이 길어지는 경우가 발생함
-- JOIN 을 사용할 경우 2개 이상의 테이블을 사용하다보니 동일한 컬럼명이 사용된 경우가 발생함
-- 이때 길어지거나 알아보기 힘든 이름을 별칭으로 변경하여 쉽게 알아볼 수 있도록 하는 기능이 Aliases임
-- 컬럼명 및 테이블명을 변경 시 영문자가 아닌 한글 및 공백문자가 포함되는 경우 ' ' 로 감싸서 해결함
-- ex) SELECT 컬럼명 as 변경할컬럼명 FROM 테이블명 as 변경할테이블명 
SELECT emp_no as '사번', first_name as '이름', last_name as '성', gender as '성별' FROM employees
WHERE emp_no = 10113;

SELECT emp_no as num, first_name as 'name', gender, birth_date as bDay
FROM employees;


SELECT employees.emp_no, employees.first_name, employees.last_name, employees.gender, salaries.salary, salaries.from_date, salaries.salary
FROM employees
JOIN salaries
ON employees.emp_no = salaries.emp_no
AND employees.emp_no < 10005;

SELECT a.emp_no as '사번', a.first_name as '이름', a.last_name as '성', a.gender as '성별', b.salary as '급여', b.from_date as '시작일', b.to_date as '종료일'
FROM employees as a
JOIN salaries as b
ON a.emp_no = b.emp_no
and a.emp_no < 10005;

