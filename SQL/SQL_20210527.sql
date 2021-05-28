-- 2021-05-27

-- JOIN
-- 2개 이상의 관계가 이어져 있는 테이블을 합쳐서 필요한 데이터를 조회하는 명령어
-- join을 사용하면 2개의 테이블을 합하여 필요한 데이터가 출력되기 때문에 중복되는 데이터들이 존재
	-- 실제로는 중복된 데이터는 아님
    -- 첫번째 테이블의 내용과 두번째 테이블의 내용이 합쳐져서 출력되기 때문에 중복되는 것처럼 보임
-- join을 사용 시 SELECT 절에 * 을 사용하면 JOIN에 사용된 모든 테이블의 모든 컬럼이 표시됨
-- JOIN 시 필요한 컬럼명만 SELECT 절에 입력하여 출력하도록 해야함
-- JOIN을 사용 시 연관되는 컬럼명끼리 연결시켜 주기 위해서 ON 명령어를 사용하고, = 연산자로 연결시킴
-- ON 사용 후 WHERE 절은 사용하지 않음, 바로 AND 명령어로 조건을 추가하면 됨
-- JOIN 시 SELECT 절의 내용이 길어지기 때문에 AS 명령어를 사용하여 별칭을 붙여 사용함

-- 사번이 10001번인 사람의 기본정보와 현재(마지막) 급여정보를 알고 싶다
SELECT emp_no, birth_date, first_name, last_name, gender, hire_date
FROM employees
WHERE emp_no = '10001';

SELECT * FROM salaries
WHERE emp_no = '10001'
AND to_date = '9999-01-01';


SELECT * FROM employees
JOIN salaries
ON employees.emp_no = salaries.emp_no;

SELECT * FROM employees;
SELECT * FROM salaries;


-- 사번이 10001 인 사람의 사번, 이름, 성씨, 현재 급여정보, 언제부터 현재 급여인지, 입사일 출력
SELECT employees.emp_no, employees.first_name, employees.last_name, salaries.salary, salaries.from_date, employees.hire_date
FROM employees
JOIN salaries
ON employees.emp_no = salaries.emp_no
AND employees.emp_no = 10001
AND salaries.to_date = '9999-01-01';

-- 문제 1) 사번이 20000인 사람의 사번, 이름, 성씨, 성별, 급여정보 전체, 해당 급여를 받은 날짜를 출력하세요
SELECT employees.emp_no, employees.first_name, employees.last_name, employees.gender, salaries.salary, salaries.from_date
FROM employees
JOIN salaries
ON employees.emp_no = salaries.emp_no
AND employees.emp_no = 20000;


SELECT emp.emp_no, emp.first_name, emp.last_name, sa.salary, sa.from_date, emp.hire_date
FROM employees as emp
JOIN salaries as sa
ON emp.emp_no = sa.emp_no
AND emp.emp_no = 10001
AND sa.to_date = '9999-01-01';


-- 문제2) 문제 1의 SQL문을 별칭을 사용하여 출력하세요
SELECT emp.emp_no, emp.first_name, emp.last_name, emp.gender, sa.salary, sa.from_date
FROM employees as emp
JOIN salaries as sa
ON emp.emp_no = sa.emp_no
AND emp.emp_no = 20000;



-- JOIN의 종류
-- INNER JOIN : 두 테이블에서 일치하는 값이 있는 데이터를 반환, 기본적인 조인, JOIN 은 INNER JOIN을 뜻함
-- ex) SELECT 테이블명.컬럼명1, 테이블명.컬럼명2, ... FROM 첫번째 테이블명
--     INNER JOIN 두번째 테이블명
--     ON 첫번째테이블명.연관컬럼명 = 두번째테이블명.연관컬럼명
--     AND 검색조건

-- 3개의 테이블을 JOIN(INNER JOIN) 하기
-- 연관성이 있는 테이블 3개를 합하여 일치하는 데이터를 반환
-- ex) SELECT 테이블명.컬럼명1, 테이블명.컬럼명2, FROM 첫번째 테이블명
--     INNER JOIN 두번째 테이블명
--     ON 첫번째 테이블명.연관컬럼명 = 두번째 테이블명.연관컬럼명
--     INNER JOIN 세번째 테이블명
--     ON 첫번째 테이블명.연관컬럼명 = 세번째 테이블명.연관컬럼명
--     AND 검색조건

-- 사번이 10001 인 사람의 사번, 이름, 성씨, 현재 급여정보, 언제부터 현재 급여인지, 입사일 출력, 현재 직급 출력
SELECT t1.emp_no, t1.first_name, t1.last_name, t2.salary, t2.from_date, t3.title, t1.hire_date
FROM employees as t1
INNER JOIN salaries as t2
ON t1.emp_no = t2.emp_no
INNER JOIN titles as t3
ON t1.emp_no = t3.emp_no
AND t1.emp_no = 10001
AND t2.to_date > '2021-05-27';

-- 문제 3) 이름이 mario인 사람의 사번, 이름, 성씨, 성별, 현재 급여, 현재 직급, 언제부터 현재급여 인지, 입사일 을 출력하세요
SELECT t1.emp_no, t1.first_name, t1.last_name, t1.gender, t2.salary, t3.title, t2.from_date, t1.hire_date
FROM employees as t1
INNER JOIN salaries as t2
ON t1.emp_no = t2.emp_no
INNER JOIN titles as t3
ON t1.emp_no = t3.emp_no
AND t1.first_name = 'mario'
AND t2.to_date > '2021-05-27';

-- 문제 4) 이름이 mario이거나 luigi 인 사람의 사번 이름, 성씨, 직급을 출력하세요
SELECT t1.emp_no, t1.last_name, t2.title
FROM employees as t1
INNER JOIN titles as t2
ON t1.emp_no = t2.emp_no
AND t1.first_name IN ('mario', 'luigi');

-- 문제 5) 입사일이 1989년 이후이고 여성인 사람 중 성씨에 er 이 들어가는 사람의 사번, 이름, 성씨, 성별, 현재 급여, 현재 직급, 입사일을 출력하세요
SELECT t1.emp_no, t1.first_name, t1.last_name, t1.gender, t2.salary, t3.title, t1.hire_date
FROM employees as t1
JOIN salaries as t2
ON t1.emp_no = t2.emp_no
JOIN titles as t3
ON t1.emp_no = t3.emp_no
AND t1.hire_date > '1989-01-01'
AND t1.gender = 'F'
AND t1.last_name LIKE '%er%'
AND t2.to_date > '2021-05-27';


-- LEFT JOIN (LEFT OUTER JOIN)
-- 왼쪽 테이블의 모든 데이터와 오른쪽 테이블에서 일치하는 데이터를 반환
-- 왼쪽 테이블을 기준으로 하기 때문에 오른쪽 테이블에 없는 데이터는 NULL로 표기됨
-- ex) SELECT 컬럼명 FROM 첫번째 테이블명
--     LEFT JOIN 두번째 테이블명
--     ON 첫번째 테이블명.연관컬럼명 = 두번째 테이블명.연관컬럼명
--     AND 검색조건


SELECT * FROM employees;

SELECT * FROM employees
INNER JOIN salaries
ON employees.emp_no = salaries.emp_no
AND salaries.to_date = '9999-01-01';


SELECT * FROM employees AS t1
LEFT JOIN salaries AS t2
ON t1.emp_no = t2.emp_no
AND t2.to_date = '9999-01-01';

SELECT * FROM employees AS t1
RIGHT JOIN salaries AS t2
ON t1.emp_no = t2.emp_no
AND t2.to_date = '9999-01-01'
ORDER BY t2.emp_no ASC;


select * from employees as a left join salaries as b on a.emp_no = b.emp_no
AND b.to_date = '9999-01-01';

select * from employees as a right join salaries as b on a.emp_no = b.emp_no
AND b.to_date = '9999-01-01';

select * from employees as a right join titles as b on a.emp_no = b.emp_no
where b.title = 'staff';

select * from salaries
where to_date <> '9999-01-01';

select * from salaries
where to_date = '9999-01-01';


-- RIGHT JOIN (RIGHT OUTER JOIN)
-- 왼쪽 테이블의 일치하는 데이터와 오른쪽 테이블의 모든 데이터를 반환
-- 오른쪽 테이블을 기준으로 하기 때문에 왼쪽 테이블에 없는 데이터는 NULL로 표기됨
-- ex) SELECT 컬럼명 FROM 첫번째 테이블명
-- RIGHT JOIN 두번째 테이블명
-- ON 첫번째테이블명.연관컬럼명 = 두번째테이블명.연관컬럼명
-- AND 검색조건

-- CROSS JOIN
-- 두 테이블의 모든 데이터를 반환, 데이터양이 엄청 커질 수 있음
-- 왼쪽 테이블과 일치하지 않는 데이터가 오른쪽 테이블에 존재하거나, 오른쪽 테이블과 일치하지 않는 데이터가 왼쪽 테이블에 존재하는 경우에도 모든 데이터를 출력
-- WHRER 절을 사용 시 INNER JOIN과 같은 결과를 출력하게 됨
-- ex) SELECT 컬럼명 FROM 첫번째 테이블명
-- CROSS JOIN 두번째 테이블명;



-- View 사용하기
-- 데이터베이스에 존재하는 일종의 가상 테이블
-- 실제 테이블처럼 행과 열을 가지고 있지만 실제로 데이터를 가지고 있지는 않음
-- 조인과 같이 여러 테이블의 데이터를 조회해야 할 경우 쉽게 가지고 올 수 있도록 함
-- view는 실제 데이터를 가지고 있지 않기 때문에 데이터를 보여주는 역할만 수행함
-- 특정 사용자에게 테이블 전체가 아닌 필요한 부분만 노출할 수 있음
-- 조인과 같이 복잡한 쿼리를 단순하게 표현할 수 있음
-- 한번 정의된 뷰는 수정이 불가능함
-- 인덱스를 사용할 수 없음
-- ex) CREATE VIEW 생성될 뷰이름 AS
--     SELECT 컬럼명1, 컬럼명2, 컬럼명3, ... FROM 테이블명 WHERE 검색조건;
-- ex) DROP VIEW 삭제할 뷰이름;
-- ex) SELECT 컬럼명1, 컬럼명2, ... FROM 뷰이름 WHERE 검색조건;
-- ex) DROP View emp;

SELECT emp_no, birth_date, first_name, last_name, gender, hire_date
FROM employees;

SELECT * FROM employees;

SELECT emp_no, first_name, last_name, hire_date
FROM employees;


CREATE VIEW emp
AS SELECT emp_no, first_name, last_name, hire_date
FROM employees;

SELECT emp_no, first_name, last_name, hire_date
FROM emp;

SELECT * FROM emp;

DROP VIEW emp;

-- 조인과 view
SELECT t1.emp_no, t1.first_name, t1.last_name, t1.gender, t2.salary, t2.to_date, t1.hire_date
FROM employees as t1
JOIN salaries as t2
ON t1.emp_no = t2.emp_no
AND t1.emp_no <= 10010;


CREATE VIEW emp_sa AS
SELECT t1.emp_no, t1.first_name, t1.last_name, t1.gender, t2.salary, t2.to_date, t1.hire_date
FROM employees AS t1
JOIN salaries AS t2
ON t1.emp_no = t2.emp_no
AND t1.emp_no < 10100;

SELECT * FROM emp_sa;

DROP VIEW emp_sa;


-- 문제 3) 사원 이름에 'en' 이 포함되는 사람의 사원번호, 생일, 이름, 성씨, 성별, 현재 급여 를 출력하는 view를 생성하고 전체 정보를 출력하세요
-- view3
CREATE VIEW view3 AS
SELECT t1.emp_no, t1.birth_date, t1.first_name, t1.last_name, t1.gender, t2.salary
FROM employees AS t1
JOIN salaries AS t2
ON t1.emp_no = t2.emp_no
AND t1.first_name LIKE '%en%'
AND t2.to_date > '2021-05-27';

SELECT * FROM view3;

-- 문제 4) 사원 번호가 20000 ~ 30000 사이이고, 이름이 alain, lucien, basil 인 사람의 사원번호, 이름, 성씨, 성별, 현재 직급 및 해당 직급이 된 날을 출력하는 view를 생성하세요
-- view4
CREATE VIEW view4 AS
SELECT t1.emp_no, t1.first_name, t1.last_name, t1.gender, t2.title, t2.from_date
FROM employees AS t1
JOIN titles AS t2
ON t1.emp_no = t2.emp_no
AND t2.to_date > '2021-05-27'
AND t1.emp_no BETWEEN 20000 AND 30000
AND t1.first_name IN ('alain', 'lucien', 'basil');

SELECT * FROM view4;


-- 문제 5) 사원 이름이 5자 이고, 사원 번호가 30000 ~ 40000 사이인 사람의 정보를 사원번호, 생일, 이름, 성씨, 성별, 현재 급여, 현재 직급으로 출력하고 최초 10명의 정보만 저장한 view를 생성 정보를 출력하세요
-- view5

CREATE VIEW view5 AS
SELECT t1.emp_no, t1.birth_date, t1.first_name, t1.last_name, t1.gender, t2.salary, t3.title
FROM employees AS t1
JOIN salaries AS t2
ON t1.emp_no = t2.emp_no
JOIN titles AS t3
ON t1.emp_no = t3.emp_no
AND t1.emp_no BETWEEN 30000 AND 40000
AND t1.first_name LIKE '_____'
AND t2.to_date > '2021-05-27'
LIMIT 10;

SELECT * FROM view5;



-- index 사용하기
-- DB의 테이블 정보를 읽어 들어는데 사용하는 방식은 Full-scan, Range-scan 방식이 있음
-- Full-scan 은 데이터 테이블의 처음부터 끝까지 검색하는 방식, Range-scan 은 데이터 테이블의 일부만 접근하여 검색하는 방식
-- Idex는 책의 목차 혹은 색인과 같은 특정 알고리즘을 이용하여 빠르게 검색을 할 수 있도록 하는 기능

-- 검색속도가 향상, 쿼리의 부하가 줄어서 시스템 전체 성능이 향상됨
-- 인덱스가 데이터 베이스의 공간을 차지함(10% 정도 추가 공간이 필요)
-- 인덱스 생성 시 시간이 많이 소요됨
-- 데이터 변경 작업이 자주 있을 경우 오히려 성능이 하락할 가능성이 높음

-- pk(기본키)는 기본적으로 index가 적용됨

-- ex) CREATE INDEX 인덱스명 ON 테이블명 (컬럼명1, 컬럼명2, ...);
-- ex) SHOW INDEX FROM 테이블명;
-- ex) ALTER TABLE 테이블명 DROP INDEX 인덱스명;

SHOW INDEX FROM titles;

SELECT * FROM titles;

SELECT * FROM titles WHERE from_date = '1985-02-18';
SELECT * FROM titles WHERE to_date = '1990-02-18';



CREATE INDEX secondry ON titles (to_date);
SHOW INDEX FROM titles;
ALTER TABLE titles DROP INDEX secondry;


SHOW INDEX FROM salaries;
SELECT * FROM salaries;

SELECT * FROM salaries WHERE from_date = '1985-02-18';
SELECT * FROM salaries WHERE to_date = '1986-02-18';

CREATE INDEX fastIndex ON salaries (to_date);
ALTER TABLE salaries DROP INDEX fastIndex;