package com.example.StartUpSync.repository;

import com.example.StartUpSync.entity.Post;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class PostRepository implements com.example.StartUpSync.repository.interfaces.PostRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> getPosts() {
		
		String sql = "FROM Post";
		return (List<Post>) entityManager.createQuery(sql).getResultList();
	}

	@Override
	public Post getPost(int PostId) {
		return entityManager.find(Post.class, PostId);
	}

}
