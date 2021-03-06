package com.example.babichev.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usr")
@ToString(exclude = {"events", "roles", "organization", "address"})
public class Usr {

  @Id
  @SequenceGenerator(
      name = "usr_seq",
      sequenceName = "usr_seq",
      initialValue = 1,
      allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_seq")
  private Long id;

  private String login;

  private String email;

  private String password;

  @Column(name = "registration_date")
  private LocalDateTime registrationDate;

  private boolean enabled;

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinTable(
      name = "usr_role",
      joinColumns = {@JoinColumn(name = "usr_id")},
      inverseJoinColumns = {@JoinColumn(name = "role_id")})
  private Set<Role> roles;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
      name = "usr_event",
      joinColumns = {@JoinColumn(name = "usr_id")},
      inverseJoinColumns = {@JoinColumn(name = "event_id")})
  private Set<Event> events;

  @PrimaryKeyJoinColumn
  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  private Profile profile;
}
