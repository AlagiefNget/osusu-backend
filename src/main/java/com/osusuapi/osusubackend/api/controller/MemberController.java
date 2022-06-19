package com.osusuapi.osusubackend.api.controller;

import com.osusuapi.osusubackend.api.dto.LoggedInAdmin;
import com.osusuapi.osusubackend.api.dto.LoginData;
import com.osusuapi.osusubackend.api.entity.Member;
import com.osusuapi.osusubackend.api.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/members/add")
    public Member save(@Valid @RequestBody Member member){
        return memberService.save(member);
    }

    @PostMapping("/members/login")
    public LoggedInAdmin login(@RequestBody LoginData loginData){
        Member member = memberService.findByEmail(loginData.getEmail(), loginData.getPassword());
        return new LoggedInAdmin(member.getEmail(), member.getId(), member.getOrganization().getId());
    }

    @GetMapping("/members/{id}")
    public List<Member> getAllMembers(@PathVariable("id") Long orgId){
        return memberService.getAllMembers(orgId);
    }

    @GetMapping("/members/member/{id}")
    public Member getMember(@PathVariable("id") Long memberid){
        return memberService.findMemberById(memberid);
    }

    @GetMapping("/members/admin/{id}")
    public List<Member> getAdmins(@PathVariable("id") Long orgId){
        return memberService.getAdmins(orgId);
    }

}
