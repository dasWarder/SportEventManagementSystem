package com.example.babichev.dao.usr;

import com.example.babichev.model.Usr;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UsrRepository extends PagingAndSortingRepository<Usr, Long> {

    Optional<Usr> getUsrByEmail(String email);
}
