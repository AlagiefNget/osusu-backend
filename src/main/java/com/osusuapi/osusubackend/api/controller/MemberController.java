package com.osusuapi.osusubackend.api.controller;

import com.osusuapi.osusubackend.api.entity.Member;
import com.osusuapi.osusubackend.api.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/api/members")
    public Member save(@Valid @RequestBody Member member){
        return memberService.save(member);
    }

}
