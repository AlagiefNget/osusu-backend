package com.osusuapi.osusubackend.api.repository;

import com.osusuapi.osusubackend.api.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends JpaRepository<Member, Long> {
}
