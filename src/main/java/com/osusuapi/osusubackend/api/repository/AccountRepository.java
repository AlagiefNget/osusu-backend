package com.osusuapi.osusubackend.api.repository;

import com.osusuapi.osusubackend.api.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {


}
