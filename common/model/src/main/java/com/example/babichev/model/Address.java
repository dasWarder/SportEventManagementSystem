package com.example.babichev.model;

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
@Table(name = "address")
public class Address {

  @Id
  @Column(name = "organization_id")
  private Long id;

  private String state;

  private String city;

  @Column(name = "extra_info")
  private String extraInfo;

  private Long zip;

  @MapsId
  @OneToOne
  @JoinColumn(name = "organization_id")
  private Organization organization;
}
