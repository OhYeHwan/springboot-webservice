package com.oyh.springboot.web; // 컨트롤러와 관련된 클래스들이 담긴 패키지

import com.oyh.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController
컨트롤러를 JSON 을 반환하는 컨트롤러로 만들어 준다.
*/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto") // HTTP Method 인 Get 의 요청을 받을 수 있는 API 를 만들어 준다.
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        /*
        @RequestParam
        외부에서 API 로 넘긴 파라미터를 가져오는 어노테이션
        여기서는 외부에서 name 이란 이름으로 넘긴 파라미터를 메서드 파라미터 nam 에 저장하게된다. (왼쪽에서 넘긴 파라미터를 오른쪽에 저장)
         */
        return new HelloResponseDto(name, amount);
    }
}
