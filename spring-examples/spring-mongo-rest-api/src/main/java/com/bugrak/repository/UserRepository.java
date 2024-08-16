package com.bugrak.repository;

import com.bugrak.entitiy.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
