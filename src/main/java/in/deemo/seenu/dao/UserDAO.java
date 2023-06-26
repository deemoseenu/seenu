package in.deemo.seenu.dao;

import in.deemo.seenu.model.User;

public class UserDAO {
	public User[] findAll () {
		User[] userlist = Userlist.listofUsers;
		return userlist;
	}
	
	public void create() {
		User newUser = new User();
		newUser.setId(0);
		newUser.setFirstName("siva");
		newUser.setLastName("Gopi");
		newUser.setEmail("Sivagopi8270@gmail.com");
		newUser.setPassword("S1i2v3@A4");
		newUser.setActive(true);
		
		Userlist.listofUsers[0] = newUser;
		
		
	}
	
		

}
