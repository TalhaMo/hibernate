package org.studyeasy.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="users")
@Table (name="users")
public class Users {

	@Id
	@Column(name="users_id")
	int users_id;
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	@Column(name="firstName")
	String firstName;
	@Column(name="lastName")
	String lastName;
	
	public Users() {
		
	}

	public Users(String username, String password, String firstName, String lastName) {
	
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getUsers_id() {
		return users_id;
	}

	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Users [users_id=" + users_id + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	
	
}
