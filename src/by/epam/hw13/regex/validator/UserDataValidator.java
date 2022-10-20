package by.epam.hw13.regex.validator;

public final class UserDataValidator {

	private static final UserDataValidator instance = new UserDataValidator();

	private UserDataValidator() {
	}

	public static UserDataValidator getInstance() {
		return instance;
	}

	// id ������ �������� ������ �� ����
	public boolean checkId(String id) {		
		String idPattern = "\\d+";
		return id.matches(idPattern) ? true : false;
	}
	
	// ��� ������� ������ �� ���� (����������� ������)
	public boolean checkFirstName(String firstName) {
		String firstNamePattern = "[a-zA-Z�-��-� ]+";
		return firstName.matches(firstNamePattern) ? true : false;
	}
	
	// ������� ������� ������ �� ���� (����������� ������)
	public boolean checkLastName(String lastName) {
		String lastNamePattern = "[a-zA-Z�-��-� ]+";
		return lastName.matches(lastNamePattern) ? true : false;
	}
	
	// ��� ������ ���� �� 4 �������� (����������� �����, �����, ������ ������������� � �����)
	public boolean checkNickName(String nickName) {
		String nickNamePattern = "[\\w\\.]{4,}";
		return nickName.matches(nickNamePattern) ? true : false;
	}
	
	// email ����� �������� �� ����, ����, ����� � ������� �������������
	public boolean checkEmail(String email) {
		String emailPattern = "[\\w\\.]+@\\w+\\.\\w+";
		return email.matches(emailPattern) ? true : false;
	}
	
	// ����� ������ ����� ��� "+37529-111-22-33"
	public boolean checkPhoneNumber(String phoneNumber) {
		String phoneNumberPattern = "\\+375(29|44|25|33)\\-\\d{3}\\-\\d{2}-\\d{2}";
		return phoneNumber.matches(phoneNumberPattern) ? true : false;
	}
	
	
	
	
	
	
	
	

}
