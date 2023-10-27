package com.example.StartUpSync.service;


import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.User;
import com.example.StartUpSync.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class PostService implements com.example.StartUpSync.service.interfaces.PostService {

	@Autowired
	private PostRepository postRepository;

	@Override
	public Post createPost(Post post) {
		return postRepository.save(post);
	}

	@Override
	public Post findPostById(Long postId) {
		return postRepository.findById(postId).orElse(null);
	}

	@Override
	public List<Post> findAllPosts() {
		return postRepository.findAll();
	}

	@Override
	public Post updatePost(Post post) {
		return postRepository.save(post);
	}

	@Override
	public void deletePost(Long postId) {
		postRepository.deleteById(postId);
	}

}
