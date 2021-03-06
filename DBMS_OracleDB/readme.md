# DBMS
## SQL Query 정리 Repository
-----------------------------

## 사용 DBMS : Oracle Database 11g

## 데이터베이스의 정의
1) 데이터를 저장하는 객체 또는 관계들의 집합
2) 다른 관계를 생성하기 위한 일련의 연산자들의 집합
3) 특정 조직의 기능을 수행하는 데 필요한 상호 관련된 데이터들의 모임
4) 사용될 데이터를 중복을 최소화하여 통합하고 쉽게 접그하여 처리할 수 있도록 저장장치에 저장하여 항상 사용할 수 있도록 운영하는 운영 데이터
5) 실시간 접근성, 계속되는 변화, 동시 공유, 내용에 의한 참조가 특징
6) 관계형 데이터베이스 : 단순한 표를 이용하여 데이터의 상호관계를 정의한 DB구조

## 관계형 데이터베이스의 구성 요소.
1) 행(Column) : 사원번호, 성, 이름..
2) 열(Row) : 줄
3) 테이블 : 데이터들을 행과 열로 표현한 것. 튜플(레코드)의 집합. 릴레이션(Relation)이라고도 한다.
4) 튜플(Tuple) : 레코드(Record)라고도 부르며 테이블의 행(컬럼)을 구성하는 개체.
5) 속성(Attribute) : 필드(Field)라고도 부르며 테이블의 열을 구성하는 항목. 데이터베이스를 구성하는 가장 작은 단위.
6) 도메인(Domain) : 하나의 속성에서 취할 수 있는 값의 범위 (성별의 도메인은 남/여)
7) 차수(Degree) : 속성의 개수
8) 기수(Cardinality) : 튜플의 개수

## DBMS (Database Manage System)
- 데이터베이스 관리 시스템. 사용자와 데이터베이스 사이에 위치하여 데이터베이스를 관리하고 사용자의 요구에 따라 정보를 생성해 줌.
- 데이터 정의 기능, 조작 기능, 제어 기능이 있다.

## SQL 문장
- DBMS의 언어.
- DB에 원하는 데이터를 요청하기 위한 문법(Query), 질의어
- SQL문장은 대소문자를 구별하지 않는다.
- 여러줄로 나눠서 입력할 수 있고 세미콜론(;)으로 마무리짓는다.

## SQL문장의 종류
- 1)DML(Data Manipulation Language) : 데이터 조작문
  - select, insert, update, delete를 가지고 있는 sql문장
- 2)DDL(Data Definition Language) : 데이터 정의문
  - create, alter, drop, rename등을 가지고 있는 sql문장
- 3)DCL(Data Control Language) : 데이터 제어문
  - grant, revoke, rollback, commit등을 가지는 sql문장
- DB의 주석 : -- , /* */
--------------------------------

## INDEX

## 데이터베이스, SQL 개념
* DBMS, DB, SQL 개념
* ORACLE 자료형
	- NUMBER(), DATE, VARCHAR, VARCHAR2(), CLOB, BLOB
* KEY
	- 기본키, 후보키, 왜래키, 대체키

## DDL
* CREATE TABLE
	- 자료형 : NUMBER(), DATE, VARCHAR, VARCHAR2(), CLOB, BLOB
	- 속성 : PRIMARY KEY, NOT NULL, UNIQUE
* ALTER TABLE
	- ADD
	- MODIFY
	- DROP
* DROP TABLE

## DML
* SELECT
	- FROM
	- WHERE
	- BETWEEN
	- IN
	- LIKE
	- ORDER BY
	- GROUP BY
		+ HAVING
* INSERT
	- INTO
* UPDATE
	- SET
* DELETE
	- FROM

## DDL
- COMMIT
- ROLLBACK
- GRANT
- REVOKE

## SQL 함수
- 날짜함수
	+ SYSDATE, MONTHS_BETWEEN(), ADD_MONTHS(), NEXT_DAY(), TO_CHAR()
- 숫자함수
	+ ROUND(), TRUNC(), POWER(), MOD()
- 문자함수 
	+ INITCAP(), LOWER(), UPPER(), SUBSTR(), REPLACE(), LENGTH()
- 그룹함수
	+ AVG(), COUNT(), MAX(), MIN(), SUM()
- 조건함수
	+ DECODE()

## 테이블 상호작용
- SUBQUERY
- JOIN
- VIEW



