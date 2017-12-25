package com.startwithjava.admin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startwithjava.admin.entities.Post;

public interface PostRepository extends JpaRepository<Post,Long> {
	public List<Post> findByStatus(int status);
  
}
