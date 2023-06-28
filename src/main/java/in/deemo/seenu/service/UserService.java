package in.deemo.seenu.service;

import in.deemo.seenu.dao.UserDAO;
import in.deemo.seenu.model.User;

public class UserService {
	public User[] getAll() {

		UserDAO userDao = new UserDAO();

		User[] userList = userDao.findAll();

		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i]);
		}

		return userList;
	}
	
	public void create() {
		User newUser = new User();
		newUser.setId(001);
		newUser.setFirstName("Siva");
		newUser.setLastName("gopi");
		newUser.setEmail("Sivagopi777@gmail.com");
		newUser.setPassword("S1i2v3@A4");
		newUser.setActive(true);
		
		
		User newUser1 = new User();
		newUser.setId(001);
		newUser.setFirstName("mahi");
		newUser.setLastName("seenu");
		newUser.setEmail("mahiseenu777@gmail.com");
		newUser.setPassword("S1i2v3@A4");
		newUser.setActive(true);
		
		User newUser2 = new User();
		newUser.setId(002);
		newUser.setFirstName("mahi");
		newUser.setLastName("seenu");
		newUser.setEmail("mahiseenu777@gmail.com");
		newUser.setPassword("S1i2v3@A4");
		newUser.setActive(true);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
		userDao.create(newUser1);
		userDao.create(newUser2);
		
	
		
	}
	


public void update() {
	User updateUser = new User();
	
	UserDAO userDao = new UserDAO();
	userDao.update(002, updateUser);
	
}
}
