package com.class1.service;

import com.class1.entity.Members;
import com.class1.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository membersRepository;

    public Members findByUserId(String userId) {
        return membersRepository.findByUser_id(userId);
    }

    public Members save(Members member) {
        return membersRepository.save(member);
    }

    public void deleteById(String userId) {
        membersRepository.deleteById(userId);
    }
}
