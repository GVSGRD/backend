package com.example.StartUpSync.repository.interfaces;

import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.User;

import java.util.List;

public interface PostRepository {
	List<Post> getPosts();
	Post getPost(int postId);
}
