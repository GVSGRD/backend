package com.example.StartUpSync.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.StartUpSync.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class UserRepository implements com.example.StartUpSync.repository.interfaces.UserRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		
		String sql = "FROM User";
		return (List<User>) entityManager.createQuery(sql).getResultList();
	}

	@Override
	public User getUser(int userId) {
		return entityManager.find(User.class, userId);
	}

}
