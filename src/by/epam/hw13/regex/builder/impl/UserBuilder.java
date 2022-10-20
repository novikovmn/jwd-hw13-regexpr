package by.epam.hw13.regex.builder.impl;

import by.epam.hw13.regex.bean.User;
import by.epam.hw13.regex.builder.Builder;
import by.epam.hw13.regex.validator.UserDataValidator;
import by.epam.hw13.regex.validator.exception.UserDataValidatorException;

public class UserBuilder implements Builder {

	private final UserDataValidator userDataValidator = UserDataValidator.getInstance();

	private User user = new User();

	@Override
	public Builder buildId(String id) throws UserDataValidatorException {
		if (userDataValidator.checkId(id)) {
			long userId = Long.parseLong(id);
			user.setId(userId);
			return this;
		} else {
			throw new UserDataValidatorException("the \"id\" is invalid");
		}
	}

	@Override
	public Builder buildFirstName(String firstName) throws UserDataValidatorException {
		if (userDataValidator.checkFirstName(firstName)) {
			user.setFirstName(firstName);
			return this;
		} else {
			throw new UserDataValidatorException(
					"the \"firstName\" must consist of letters only (spaces are allowed) and must not be empty");
		}
	}

	@Override
	public Builder buildLastName(String lastName) throws UserDataValidatorException {
		if (userDataValidator.checkLastName(lastName)) {
			user.setLastName(lastName);
			return this;
		} else {
			throw new UserDataValidatorException(
					"the \"lastName\" must consist of letters only (spaces are allowed) and must not be empty");
		}
	}

	@Override
	public Builder buildNicktName(String nickName) throws UserDataValidatorException {
		if (userDataValidator.checkNickName(nickName)) {
			user.setNickName(nickName);
			return this;
		} else {
			throw new UserDataValidatorException(
					"the \"nickName\" is invalid (need at least 4 symbols: letters, digits and dots are allowed)");
		}
	}

	@Override
	public Builder buildEmail(String email) throws UserDataValidatorException {
		if (userDataValidator.checkEmail(email)) {
			user.setEmail(email);
			return this;
		} else {
			throw new UserDataValidatorException(
					"the \"email\" is invalid (letters, digits, dots and underscores are allowed)");
		}

	}

	@Override
	public Builder buildPhoneNumber(String phoneNumber) throws UserDataValidatorException {
		if (userDataValidator.checkPhoneNumber(phoneNumber)) {
			user.setPhoneNumber(phoneNumber);
			return this;
		} else {
			throw new UserDataValidatorException("the \"phoneNumber\" is invalid (example: +37529-111-22-33)");
		}
	}

	@Override
	public User build() {
		return user;
	}

}
