package com.startwithjava.admin.entities;

public enum PostType {
  POST(1),PAGE(2);
	private int postType;
	PostType(int n){
		postType = n;
	}
}
