package com.osusuapi.osusubackend.api.services;

import com.osusuapi.osusubackend.api.entity.Member;
import com.osusuapi.osusubackend.api.entity.Organization;

public interface IOrganizationService {

    Organization save(Organization organization);
    Organization getOrgData(Long id);
    Organization updateOrgData(Long id, Organization organization);
    void deleteOrg(Long id);
    Member addSuperAdmin(Member admin);
}
