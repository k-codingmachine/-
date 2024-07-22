package com.cola.member.Controller;


import com.cola.member.domain.dto.MemberDTO;
import com.cola.member.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor // 자동 생성자 주입
public class MemberController {
    // 생성자 주입
    private final MemberService memberService;
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "login";
    }
    @GetMapping("/member/login")
    public String loginForm(){
        return "login";
    }


    @PostMapping("/member/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
        MemberDTO loginResult = memberService.login(memberDTO);

        if(loginResult != null){
            // login 성공
            session.setAttribute("loginEmail", loginResult.getEmail());
            return "main";
        }else {
            // login 실패
            return "login";
        }
    }

    @GetMapping("/member/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }


    // ajax사용시 반환타입에 ResponseBody 반드시 명시
    @PostMapping("/member/email-check")
    public @ResponseBody String emailCheck(@RequestParam("email") String email){
        System.out.println("email = " + email);
        String checkResult = memberService.emailCheck(email);
        return checkResult;
//        if(checkResult != null){
//            return "ok";
//        } else {
//            return "no";
//        }

    }


}
