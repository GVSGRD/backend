package com.example.StartUpSync.controller;


import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.service.interfaces.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService postService;
	
	@GetMapping("get")
	public ResponseEntity<List<Post>> getPosts(){
		
		List<Post> posts = postService.getPosts();
		return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
		
	}

	@GetMapping("get/{id}")
	public ResponseEntity<Post> getPost(@PathVariable("id") Integer id){
		Post post = postService.getPost(id);
		return new ResponseEntity<Post>(post, HttpStatus.OK);
	}

}

