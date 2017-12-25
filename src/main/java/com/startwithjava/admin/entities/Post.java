package com.startwithjava.admin.entities;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Post extends AbstractEntity{
	private String title;
	private String postContent;
	@ManyToOne
	private User author;
	private PostType postType;
	private PostStatus status;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public PostType getPostType() {
		return postType;
	}
	public void setPostType(PostType postType) {
		this.postType = postType;
	}
	public PostStatus getStatus() {
		return status;
	}
	public void setStatus(PostStatus status) {
		this.status = status;
	}
}
