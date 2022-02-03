package com.example.babichev.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "event")
@ToString(exclude = {"organization"})
public class Event {

  @Id
  @SequenceGenerator(
      name = "event_seq",
      sequenceName = "event_seq",
      initialValue = 1,
      allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_seq")
  private Long id;

  @Column(name = "sport_name")
  private String sportName;

  private String location;

  private LocalDateTime date;

  @Column(name = "first_place_prize")
  private String firstPlacePrize;

  @Column(name = "second_place_prize")
  private String secondPlacePrize;

  @Column(name = "third_place_prize")
  private String thirdPlacePrize;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "organization_id")
  private Organization organization;

  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "events")
  private Set<Usr> users;
}
