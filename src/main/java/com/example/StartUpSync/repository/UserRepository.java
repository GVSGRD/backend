package com.example.StartUpSync.repository;

import java.util.List;
import java.util.Optional;

import com.example.StartUpSync.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

}