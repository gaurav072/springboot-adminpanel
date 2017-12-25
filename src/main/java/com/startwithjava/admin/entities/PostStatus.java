package com.startwithjava.admin.entities;

public enum PostStatus {
 DRAFT(1),PUBLISH(2),SCHEDULE(3);
	private int status;
	PostStatus(int n){
		status = n;
	}
}
