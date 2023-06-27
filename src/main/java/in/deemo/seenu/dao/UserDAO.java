package in.deemo.seenu.dao;

import in.deemo.seenu.model.User;

public class UserDAO {
	public User[] findAll () {
		User[] userlist = Userlist.listofUsers;
		return userlist;
	}
	
	public void create(User newUser) {
		
		Userlist.listofUsers[0] = newUser;
		
		
	}
	
		

}
