package com.osusuapi.osusubackend.api.repository;

import com.osusuapi.osusubackend.api.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepository extends JpaRepository<Payments, Long> {
}
