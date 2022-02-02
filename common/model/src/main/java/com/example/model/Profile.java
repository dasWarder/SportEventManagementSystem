package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profile")
public class Profile {

    @Id
    @Column(name = "usr_id")
    private Long id;

    private String firstName;

    private String lastName;

    private Long age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @MapsId
    @OneToOne
    @JoinColumn(name = "usr_id")
    private Usr user;
}
