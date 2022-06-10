package com.osusuapi.osusubackend.api.repository;

import com.osusuapi.osusubackend.api.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
