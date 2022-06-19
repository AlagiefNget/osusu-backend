package com.osusuapi.osusubackend.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "Please specify your organization name") // add @Valid in the controller save method
    private String name;
    private LocalDate startDate;
    private int paymentCycles;
    @Value("500.0")
    private double paymentAmount;
    @OneToMany(mappedBy = "organization")
    private List<Member> members;

}
