package com.example.StartUpSync.service;


import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.repository.interfaces.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements com.example.StartUpSync.service.interfaces.PostService {
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public List<Post> getPosts() {
		return postRepository.getPosts();
	}

	@Override
	public Post getPost(int postId) {
		return postRepository.getPost(postId);
	}

}
