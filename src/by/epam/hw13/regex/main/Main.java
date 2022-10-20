package by.epam.hw13.regex.main;

import by.epam.hw13.regex.bean.User;
import by.epam.hw13.regex.builder.impl.UserBuilder;
import by.epam.hw13.regex.validator.exception.UserDataValidatorException;

public class Main {

	public static void main(String[] args) throws UserDataValidatorException {
		
		UserBuilder builder = new UserBuilder();
		
		User user = builder
							.buildId("111")
							.buildFirstName("Ivan")
							.buildLastName("Ivanov")
							.buildNicktName("agent007")
							.buildEmail("ivan.agent007@bk.ru")
							.buildPhoneNumber("+37529-222-33-44")
							.build();
		
		System.out.println(user);

	}

}
