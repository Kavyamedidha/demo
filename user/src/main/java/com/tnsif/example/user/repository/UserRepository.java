package com.tnsif.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.example.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
