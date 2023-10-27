package com.example.StartUpSync.repository;


import com.example.StartUpSync.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RequestRepository extends JpaRepository<Request, Long> {
}
