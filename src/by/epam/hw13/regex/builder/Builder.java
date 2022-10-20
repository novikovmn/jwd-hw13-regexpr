package by.epam.hw13.regex.builder;

import by.epam.hw13.regex.bean.User;
import by.epam.hw13.regex.validator.exception.UserDataValidatorException;

public interface Builder {

	Builder buildId(String id) throws UserDataValidatorException;

	Builder buildFirstName(String firstName) throws UserDataValidatorException;

	Builder buildLastName(String lastName) throws UserDataValidatorException;

	Builder buildNicktName(String nickName) throws UserDataValidatorException;

	Builder buildEmail(String email) throws UserDataValidatorException;

	Builder buildPhoneNumber(String phoneNumber) throws UserDataValidatorException;

	User build();

}
