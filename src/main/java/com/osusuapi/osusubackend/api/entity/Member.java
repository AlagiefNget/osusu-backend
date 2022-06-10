package com.osusuapi.osusubackend.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "Please specify member's name") // add @Valid in the controller save method
    private String name;
    private String phone;
    private String address;
    @OneToMany
    private List<Payments> payments;
    @ManyToOne
    private Organization organization;


}
