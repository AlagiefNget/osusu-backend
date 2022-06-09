package com.osusuapi.osusubackend.api.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private double amount;
    private LocalDate payment_date;
    private String receivedBy;
    @ManyToOne
    private Member member;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
