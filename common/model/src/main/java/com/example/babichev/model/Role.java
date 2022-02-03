package com.example.babichev.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role")
public class Role {

  @Id
  @SequenceGenerator(
      name = "role_seq",
      sequenceName = "role_seq",
      initialValue = 100000,
      allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq")
  private Long id;

  private String role;

  @ManyToMany(mappedBy = "roles", targetEntity = Usr.class)
  private Set<Usr> users;
}
