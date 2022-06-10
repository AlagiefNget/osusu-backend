package com.osusuapi.osusubackend.api.services;

import com.osusuapi.osusubackend.api.entity.Organization;
import com.osusuapi.osusubackend.api.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService implements IOrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository; //DAO

    @Override
    public Organization save(Organization organization) {
        return organizationRepository.save(organization);
    }
}
