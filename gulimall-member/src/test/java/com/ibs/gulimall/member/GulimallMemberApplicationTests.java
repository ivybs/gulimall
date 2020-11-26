package com.ibs.gulimall.member;

import com.ibs.gulimall.member.entity.MemberEntity;
import com.ibs.gulimall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    void contextLoads() {

    }

}
