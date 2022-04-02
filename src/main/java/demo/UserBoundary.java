package demo;

import java.util.Arrays;

public class UserBoundary {

	private UserName name;
	private String email;
	private String password;
	private String birthday;
	private Arrays[] roles;

	public UserBoundary(String string, String string2, String string3) {
		this.email = string;
		this.password = string2;
		this.birthday = string3;
	}

	public UserBoundary(String lastname, String email, String password, String birthday, Arrays[] roles) {
		this.name.setLastname(lastname);
		this.email = email;
		this.password = password;
		this.birthday = birthday;
		this.roles = roles;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Arrays[] getRoles() {
		return roles;
	}

	public void setRoles(Arrays[] roles) {
		this.roles = roles;
	}

	public UserName getName() {
		return name;
	}

	public void setName(UserName name) {
		this.name = name;
	}

}