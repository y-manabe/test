package forms;

import play.data.validation.Constraints.Required;

public class UserDataForm {
	
	public String message;
	
	public String err_name;
	
	public String err_email;
	
	@Required
	public String name;
	
	@Required
	public String email;
	
	public UserDataForm() {
		message = "ユーザ情報を入力してください";
	}
	
}
