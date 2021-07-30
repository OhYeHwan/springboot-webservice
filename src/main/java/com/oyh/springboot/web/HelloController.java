package com.oyh.springboot.web; // 컨트롤러와 관련된 클래스들이 담긴 패키지

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController
컨트롤러를 JSON 을 반환하는 컨트롤러로 만들어 준다.
*/
@RestController
public class HelloController {
    @GetMapping("/hello") // HTTP Method 인 Get 의 요청을 받을 수 있는 API 를 만들어 준다.
    public String hello() {
        return "hello";
    }
}
