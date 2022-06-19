package com.osusuapi.osusubackend.api.services;

import com.osusuapi.osusubackend.api.entity.Member;
import com.osusuapi.osusubackend.api.entity.Organization;
import com.osusuapi.osusubackend.api.repository.MembersRepository;
import com.osusuapi.osusubackend.api.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class OrganizationService implements IOrganizationService {

    @Autowired
    private OrganizationRepository organizationDao; //DAO

    @Autowired
    MembersRepository membersRepository;

    @Override
    public Organization save(Organization organization) {
        return organizationDao.save(organization);
    }

    @Override
    public Organization getOrgData(Long id) {
        return organizationDao.findById(id).orElse(null);
    }

    @Override
    public Organization updateOrgData(Long id, Organization organization) {
        Organization org = organizationDao.findById(id).orElse(null);
        if(org != null){
            if(Objects.nonNull(org.getName()) && !"".equalsIgnoreCase(org.getName())){
                org.setName(organization.getName());
            }
            organizationDao.save(org);
        }
        return org;
    }

    @Override
    public void deleteOrg(Long id) {
        organizationDao.deleteById(id);
    }

    @Override
    public Member addSuperAdmin(Member admin) {
        Organization organization = organizationDao.findById(admin.getOrgId()).orElse(null);
        admin.setOrganization(organization);
        admin.setAdmin(true);
        admin.setSuperAdmin(true);
        return membersRepository.save(admin);
    }


}
