package com.osusuapi.osusubackend.api.aop;

import com.osusuapi.osusubackend.api.dto.OrgWithSuperAdmin;
import com.osusuapi.osusubackend.api.entity.Member;
import com.osusuapi.osusubackend.api.entity.Organization;
import com.osusuapi.osusubackend.api.repository.MembersRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AddSuperAdminAspect {

    @Autowired
    MembersRepository membersDao;

//    @AfterReturning(value = "execution(* com.osusuapi.osusubackend.api.controller.OrganizationController.register(..))", returning = "org")
//    public OrgWithSuperAdmin addSuperAdmin(JoinPoint joinPoint, Organization org){
//        Object[] args = joinPoint.getArgs();
//        Member superAdmin = (Member) args[1];
//        superAdmin.setAdmin(true);
//        superAdmin.setSuperAdmin(true);
//        superAdmin.setOrganization(org);
//        Member savedSuperAdmin = membersDao.save(superAdmin);
//        return new OrgWithSuperAdmin(org, savedSuperAdmin);
//    }
}
