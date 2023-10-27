package com.example.StartUpSync.repository;

import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

}
