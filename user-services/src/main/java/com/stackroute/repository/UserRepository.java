package com.stackroute.repository;

import com.stackroute.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//we have used here user Interface
//JpaRepository use to connect the spring application with relational database
public interface UserRepository extends JpaRepository<User,Integer> {
}
