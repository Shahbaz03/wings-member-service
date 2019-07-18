package com.wings.member.repository;

import com.wings.member.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MemberRepository extends MongoRepository<Member, Integer> {
    //List<Member> findAll();

    //Member findById(Integer id);

    //List<Member> findByName(String name);

    //Member save(Member member);

}
