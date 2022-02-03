package com.example.babichev.dao.role;

import com.example.babichev.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> getRoleByRole(String role);
}
