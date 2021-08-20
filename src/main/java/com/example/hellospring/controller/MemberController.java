package com.example.hellospring.controller;

import com.example.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
// spring 처음에 뜰때, 스프링 컨테이너라는 큰 통에 @Controller 어노테이션 붙은 멤버 컨트롤러 객채를 생성해서 스프링 컨테이너에 넣어서 들고있고, 관리한다.
// 스프링 빈이 관리된다, 고 표현할 수 있다.
public class MemberController {

    // private final MemberService memberService = new MemberService();
    // new 로 선언해서 넣어주어도 되지만, 이렇게 할 경우 다른 컨트롤러에서 MemberService 사용할 경우 거기에는 새로운 MemberService 객체를 또 만들어서 쓰고
    // 결과적으로는 MemberService 쓰는 컨트롤러마다 각자의 MemberService 객체를 가지게됨.
    // 하지만 MemberService는 하나만 만들어서 여기저기 가져가 쓰게하는게 좋음. 굳이 여러개 따로 만들어서 쓸 필요가 없음
    // -> 이걸 스프링이 자동으로 관리해줌. 그렇게 코드를 짜야함

    private final MemberService memberService;

    @Autowired // 생성자에 사용된 클래스 객체를 스프링 컨테이너에서 알아서 찾아서 자동으로 연결해줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

}
