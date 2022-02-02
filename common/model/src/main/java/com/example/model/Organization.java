package com.example.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "organization")
@ToString(exclude = {"address", "events"})
public class Organization {

  @Id
  @SequenceGenerator(
      name = "org_seq",
      sequenceName = "org_seq",
      allocationSize = 1,
      initialValue = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "org_seq")
  private Long id;

  private String name;

  @PrimaryKeyJoinColumn
  @OneToOne(mappedBy = "organization", cascade = CascadeType.ALL)
  private Address address;

  @Column(name = "adding_date")
  private LocalDateTime addingDate;

  @OneToMany(
      fetch = FetchType.LAZY,
      cascade = CascadeType.ALL,
      orphanRemoval = true,
      mappedBy = "organization")
  private Set<Event> events;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "organization")
  private Set<Profile> profiles;
}
