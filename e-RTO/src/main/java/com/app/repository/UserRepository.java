package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	
}
