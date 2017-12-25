package com.startwithjava.admin.entities;

import java.time.LocalDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public abstract class AbstractEntity {
	 @Id @GeneratedValue(strategy=GenerationType.AUTO) 
	 protected Integer Id;
	 @CreatedDate LocalDateTime createdDate;
	 @LastModifiedDate LocalDateTime lastModifiedDate;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
