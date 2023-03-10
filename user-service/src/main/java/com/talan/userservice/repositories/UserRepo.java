package com.talan.userservice.repositories;

import com.talan.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
