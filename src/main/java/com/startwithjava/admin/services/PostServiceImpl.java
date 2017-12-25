package com.startwithjava.admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.startwithjava.admin.entities.Post;
import com.startwithjava.admin.repositories.PostRepository;

public class PostServiceImpl implements PostService{
	@Autowired
	PostRepository postRepository;
	public List<Post> findActiveAllPages() {
		return postRepository.findAll();
	}

	public Post findPostById(long postId) {
		return null;
	}

	public long persistPost(Post post) {
		return 0;
	}

	public boolean updatePost(Post post) {
		return false;
	}

	public boolean deletePost(long postId) {
		return false;
	}

	public Post getPostByTitle(String title) {
		return null;
	}

}
