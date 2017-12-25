package com.startwithjava.admin.services;

import java.util.List;

import com.startwithjava.admin.entities.Post;

public interface PostService {
	public List<Post> findActiveAllPages();
	public Post findPostById(long postId);
	public long persistPost(Post post);
	public boolean updatePost(Post post); 
	public boolean deletePost(long postId);
	public Post getPostByTitle(String title);
}

