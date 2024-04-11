package com.yash.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.usermanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
