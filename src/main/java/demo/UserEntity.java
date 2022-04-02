package demo;

@Document(collection = "User")
public class UserEntity {
	private UserName username;
	@Id
	private String email;
	private String password;
	private String birthday;

	public UserEntity(String username, String email, String password) {
		super();
		this.username.setLastname(username);
		this.email = email;
		this.password = password;

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

}
