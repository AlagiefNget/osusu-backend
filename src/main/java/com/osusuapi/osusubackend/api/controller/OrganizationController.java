package com.osusuapi.osusubackend.api.controller;

import com.osusuapi.osusubackend.api.entity.Member;
import com.osusuapi.osusubackend.api.entity.Organization;
import com.osusuapi.osusubackend.api.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/register")
    public Organization register(@Valid @RequestBody Organization organization){
        return organizationService.save(organization);
    }

    @PostMapping("/organization/super_admin")
    public Member addSuperAdmin(@Valid @RequestBody Member admin){
        return organizationService.addSuperAdmin(admin);
    }

    @GetMapping("/organization/{id}")
    public Organization getOrgData(@PathVariable Long id){
        return organizationService.getOrgData(id);
    }

    @PutMapping("organization/{id}")
    public Organization updateOrgData(@PathVariable Long id, @Valid Organization organization){
        return organizationService.updateOrgData(id, organization);
    }

    @DeleteMapping("organization/{id}")
    public String deleteOrg(@PathVariable Long id){
        organizationService.deleteOrg(id);
        return "Organization with id " + id + " successfully deleted.";
    }

}
