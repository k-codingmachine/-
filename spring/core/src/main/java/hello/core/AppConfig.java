package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;


public class AppConfig { // 공연 기획자(배우들을 섭외한다.)

    public MemberService memberService(){
        return new MemberServiceImpl(MemberRepository());
    }

    private static MemoryMemberRepository MemberRepository() {
        return new MemoryMemberRepository();
    }


    public OrderService orderService(){
        return new OrderServiceImpl(MemberRepository(), discountPolicy()); // ctrl + alt + m => static메서드 생성(아래 26번째 줄)
    }

    private static DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }


}
