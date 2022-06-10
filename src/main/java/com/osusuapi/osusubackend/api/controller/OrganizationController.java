package com.osusuapi.osusubackend.api.controller;

import com.osusuapi.osusubackend.api.entity.Organization;
import com.osusuapi.osusubackend.api.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/api/register")
    public Organization register(@RequestBody Organization organization){
        return organizationService.save(organization);
    }
}
