package com.osusuapi.osusubackend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoggedInAdmin {
    private String email;
    private Long memberId;
    private Long orgId;
}
