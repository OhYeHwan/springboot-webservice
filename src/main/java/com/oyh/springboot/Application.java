package com.oyh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
@SprintBootApplication
스프링부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
특히나 해당 어노테이션이 있는 위치부터 설정을 읽음
이 클래스는 항상 프로젝트의 최상단에 위치 해야한다.
*/
@EnableJpaAuditing
@SpringBootApplication
public class Application { // 프로젝트의 메인클래스
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 내장 WAS 실행
    }
}