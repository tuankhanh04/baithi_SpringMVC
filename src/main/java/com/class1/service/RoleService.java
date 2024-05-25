package com.class1.service;

import com.class1.entity.Roles;
import com.class1.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Roles findByUserId(String userId) {
        return roleRepository.findByUser_id(userId);
    }
}
