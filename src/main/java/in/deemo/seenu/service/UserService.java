package in.deemo.seenu.service;

import in.deemo.seenu.dao.UserDAO;
import in.deemo.seenu.model.User;

public class UserService {
	public User[] getAll() {

		UserDAO userDao = new UserDAO();

		User[] userList = userDao.findAll();

		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList);
		}

		return userDao.findAll();

	}

}
