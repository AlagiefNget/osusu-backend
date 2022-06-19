package com.osusuapi.osusubackend.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data // allows you to use Lombok
@NoArgsConstructor
@AllArgsConstructor
//@Builder //check for Builder pattern
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "Please specify member's name") // add @Valid in the controller save method
    private String name;
    private String phone;
    private String address;
    @Email(message = "Please specify a valid email")
    private String email;
    private String password;
    public boolean isAdmin;
    @Value("false")
    public boolean isSuperAdmin;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Payments> payments;
    @ManyToOne
    @JsonIgnore
    private Organization organization;
    @Transient
    private Long orgId;
    @Value("false")
    private boolean awarded;


}
