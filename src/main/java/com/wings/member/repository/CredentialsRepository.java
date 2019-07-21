package com.wings.member.repository;

import com.wings.member.data.Credentials;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CredentialsRepository extends MongoRepository<Credentials, String> {
    Credentials findByEmailId(String emailId);
}
