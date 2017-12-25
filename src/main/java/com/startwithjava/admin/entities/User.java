package com.startwithjava.admin.entities;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class User extends AbstractEntity{
	private String email;
	private String username;
	private String password;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	private List<RoleMaster> roles;
	private short status;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RoleMaster> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleMaster> roles) {
		this.roles = roles;
	}
	public short getStatus() {
		return status;
	}
	public void setStatus(short status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
