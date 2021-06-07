package com.btc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 스프링부트의 핵심 어노테이션
// SpringBootApplication 어노테이션은 3개의 어노테이션으로 구성되어 있음

// @EnableAutoConfiguration
//	스프링의 다양한 설정을 자동으로 완료


// 자바 빈 : 자바 클래스 파일, JSP 웹 프로그래밍에서 사용하는 자바 클래스 파일

// @ComponentScan
//	스프링에서 자바 빈을 사용하기 위해서는 pom.xml 파일에 사용할 자바 빈을 모두 선언해야 함
//	ComponentScan 어노테이션을 사용하면 자동으로 자바 빈 파일을 검색하여 사용할 수 있도록 등록함
// Controller 파일도 ComponentScan 어노테이션이 자동으로 등록하기 때문에 아무런 설정없이 사용할 수 있음

// @Configuration
//	자바 기반의 설정 파일임을 표시하는 어노테이션
//	기존 레거시 스프링 프로젝트(3.x 버전)에서는 프로젝트의 설정 부분을 모두 xml 파일에 입력해야 했음
//	스프링 4버전 부터 자바 클래스 기반의 설정파일을 사용할 수 있게 변경됨
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
