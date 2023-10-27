package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.User;

import java.util.List;

public interface PostService {
	Post createPost(Post post);
	Post findPostById(Long postId);
	List<Post> findAllPosts();
	Post updatePost(Post post);
	void deletePost(Long postId);

}
