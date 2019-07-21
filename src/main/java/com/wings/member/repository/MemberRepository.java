package com.wings.member.repository;

import com.wings.member.data.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MemberRepository extends MongoRepository<Member, String> {
    Member findByEmailId(String emailId);

    List<Member> findByFirstName(String firstName);

    List<Member> findByLastName(String lastName);
}
