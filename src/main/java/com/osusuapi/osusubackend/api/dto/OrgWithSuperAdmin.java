package com.osusuapi.osusubackend.api.dto;

import com.osusuapi.osusubackend.api.entity.Member;
import com.osusuapi.osusubackend.api.entity.Organization;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrgWithSuperAdmin {
    Organization organization;
    Member member;
}
