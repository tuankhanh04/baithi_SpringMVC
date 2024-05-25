package com.class1.repository;

import com.class1.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Roles, String> {
    Roles findByUser_id(String user_id);
}
