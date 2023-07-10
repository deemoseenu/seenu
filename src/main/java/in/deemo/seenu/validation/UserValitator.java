package in.deemo.seenu.validation;

import in.deemo.seenu.exception.ValidationException;
import in.deemo.seenu.model.User;
import in.deemo.seenu.util.StringUtil;

public class UserValitator {
	
	public static void validate(User user) throws ValidationException {
		if (user == null) {
			throw new ValidationException("Invalid user input");
		}
//		if(user.getEmail()==null || "".equals(user.getEmail().trim())) {
//			
//			throw new ValidationException("Email cannot be null or empty");
//			
//		}
		StringUtil.rejectIfInvalidString(user.getEmail(), "Email");
		StringUtil.rejectIfInvalidString(user.getPassword(), "Password");
		
		StringUtil.rejectIfInvalidString(user.getFirstName(), "FirstName");
//		
	}

}
