package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.User;

import java.util.List;

public interface PostService {
	List<Post> getPosts();
	Post getPost(int postId);
}
