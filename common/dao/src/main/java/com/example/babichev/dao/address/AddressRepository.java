package com.example.babichev.dao.address;

import com.example.babichev.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
