package com.class1.repository;

import com.class1.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Members, String> {
    Members findByUser_id(String user_id);
}
