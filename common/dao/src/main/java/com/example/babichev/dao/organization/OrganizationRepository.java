package com.example.babichev.dao.organization;


import com.example.babichev.model.Organization;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface OrganizationRepository extends PagingAndSortingRepository<Organization, Long> {

    Optional<Organization> getOrganizationByName(String name);
}
