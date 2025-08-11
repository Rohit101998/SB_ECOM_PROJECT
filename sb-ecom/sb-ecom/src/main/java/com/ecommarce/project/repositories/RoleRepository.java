package com.ecommarce.project.repositories;

import com.ecommarce.project.model.AppRole;
import com.ecommarce.project.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
