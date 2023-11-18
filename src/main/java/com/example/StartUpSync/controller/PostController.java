package com.example.StartUpSync.controller;


import com.example.StartUpSync.entity.Post;
import com.example.StartUpSync.entity.User;
import com.example.StartUpSync.service.interfaces.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/post")
@CrossOrigin("http://localhost:3000")
public class PostController {

	@Autowired
	private PostService postService;

	@PostMapping("/create")
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		Post resp = postService.createPost(post);
		return new ResponseEntity<Post>(resp, HttpStatus.CREATED);
	}

	@GetMapping("/{postId}")
	public ResponseEntity<Post> getPostById(@PathVariable Long postId) {
		Post resp = postService.findPostById(postId);
		return new ResponseEntity<Post>(resp, HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Post>> getAllPosts() {
		List<Post> resp = postService.findAllPosts();
		return new ResponseEntity<List<Post>>(resp, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Post> updatePost(@RequestBody Post post) {
		Post resp = postService.updatePost(post);
		return new ResponseEntity<Post>(resp, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{postId}")
	public ResponseEntity<Long> deletePost(@PathVariable Long postId) {
		postService.deletePost(postId);
		return new ResponseEntity<Long>(postId, HttpStatus.NO_CONTENT);
	}
}


