package com.springapps.bookingapp.repositories;

import com.springapps.bookingapp.entities.Role;
import com.springapps.bookingapp.entities.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByRoleType(RoleType roleType);
}
