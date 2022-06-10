package com.osusuapi.osusubackend.api.services;

import com.osusuapi.osusubackend.api.entity.Member;
import com.osusuapi.osusubackend.api.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements IMemberService {

    @Autowired
    MembersRepository membersRepository;

    @Override
    public Member save(Member member) {
        return membersRepository.save(member);
    }
}
