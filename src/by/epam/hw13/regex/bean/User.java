package by.epam.hw13.regex.bean;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

	private static final long serialVersionUID = -1306062716466974913L;

	private long id;
	private String firstName;
	private String lastName;
	private String nickName;
	private String email;
	private String phoneNumber;

	public User() {
		super();
	}

	public User(long id, String firstName, String lastName, String nickName, String email, String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, id, lastName, nickName, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(nickName, other.nickName)
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}

	@Override
	public String toString() {

		StringBuilder userData = new StringBuilder();
		StringBuilder prefix = new StringBuilder("User [");
		StringBuilder suffix = new StringBuilder(" ]");
		
		if (id != 0) {
			userData.append(" id=" + id);
		}

		if (firstName != null) {
			userData.append(" firstName=" + firstName);
		}

		if (lastName != null) {
			userData.append(" lastName=" + lastName);
		}

		if (nickName != null) {
			userData.append(" nickName=" + nickName);
		}

		if (email != null) {
			userData.append(" email=" + email);
		}

		if (phoneNumber != null) {
			userData.append(" phoneNumber=" + phoneNumber);
		}

		return prefix.append(userData).append(suffix).toString();
	}

}
