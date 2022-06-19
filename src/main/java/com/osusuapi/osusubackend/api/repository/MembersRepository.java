package com.osusuapi.osusubackend.api.repository;

import com.osusuapi.osusubackend.api.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembersRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
//    @Query(value = "select * from member as m where m.organization_id = ?1 and is_admin != 1", nativeQuery = true)
    @Query(value = "select * from member as m where m.organization_id = ?1 ", nativeQuery = true)
    List<Member> findByMembers(Long orgId);
    @Query(value = "select * from member as m where m.organization_id = ?1 and is_admin != 0", nativeQuery = true)
    List<Member> findByAdmins(Long orgId);
}
