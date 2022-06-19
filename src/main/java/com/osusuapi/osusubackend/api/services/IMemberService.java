package com.osusuapi.osusubackend.api.services;

import com.osusuapi.osusubackend.api.entity.Member;

import java.util.List;

public interface IMemberService {

    Member save(Member member);
    List<Member> getAllMembers(Long orgId);
    List<Member> getAdmins(Long orgId);
    Member findMemberById(Long memberid);
}
