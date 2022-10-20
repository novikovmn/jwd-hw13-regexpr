package by.epam.hw13.regex.validator;

public final class UserDataValidator {

	private static final UserDataValidator instance = new UserDataValidator();

	private UserDataValidator() {
	}

	public static UserDataValidator getInstance() {
		return instance;
	}

	// id должен состоять только из цифр
	public boolean checkId(String id) {		
		String idPattern = "\\d+";
		return id.matches(idPattern) ? true : false;
	}
	
	// имя состоит только из букв (допускается пробел)
	public boolean checkFirstName(String firstName) {
		String firstNamePattern = "[a-zA-Zа-яА-Я ]+";
		return firstName.matches(firstNamePattern) ? true : false;
	}
	
	// фамилия состоит только из букв (допускается пробел)
	public boolean checkLastName(String lastName) {
		String lastNamePattern = "[a-zA-Zа-яА-Я ]+";
		return lastName.matches(lastNamePattern) ? true : false;
	}
	
	// ник должен быть от 4 символов (допускаются буквы, цифры, нижнее подчеркивание и точка)
	public boolean checkNickName(String nickName) {
		String nickNamePattern = "[\\w\\.]{4,}";
		return nickName.matches(nickNamePattern) ? true : false;
	}
	
	// email может состоять из букв, цифр, точек и нижнего подчеркивания
	public boolean checkEmail(String email) {
		String emailPattern = "[\\w\\.]+@\\w+\\.\\w+";
		return email.matches(emailPattern) ? true : false;
	}
	
	// номер должен иметь вид "+37529-111-22-33"
	public boolean checkPhoneNumber(String phoneNumber) {
		String phoneNumberPattern = "\\+375(29|44|25|33)\\-\\d{3}\\-\\d{2}-\\d{2}";
		return phoneNumber.matches(phoneNumberPattern) ? true : false;
	}
	
	
	
	
	
	
	
	

}
