package com.osusuapi.osusubackend.api.services;

import com.osusuapi.osusubackend.api.entity.Member;
import com.osusuapi.osusubackend.api.entity.Organization;
import com.osusuapi.osusubackend.api.repository.MembersRepository;
import com.osusuapi.osusubackend.api.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MemberService implements IMemberService {

    @Autowired
    MembersRepository membersRepository;

    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public Member save(Member member) {
        member.setPassword("12345");
        Organization organization =organizationRepository.findById(member.getOrgId()).orElse(null);
        member.setOrganization(organization);
        return membersRepository.save(member);
    }

    public Member findByEmail(String email, String password) {
        Member member = membersRepository.findByEmail(email);
        if(!Objects.equals(member.getPassword(), password)){
            return null;
        }
        return member;
    }

    public List<Member> getAllMembers(Long orgId) {
        return membersRepository.findByMembers(orgId);
    }

    @Override
    public List<Member> getAdmins(Long orgId) {
        return membersRepository.findByAdmins(orgId);
    }

    @Override
    public Member findMemberById(Long memberid) {
        return membersRepository.findById(memberid).orElse(null);
    }
}
