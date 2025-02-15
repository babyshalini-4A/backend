package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	public User findByEmail(String email);
}