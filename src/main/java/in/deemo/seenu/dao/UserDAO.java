package in.deemo.seenu.dao;

import in.deemo.seenu.model.User;

public class UserDAO {
	public User[] findAll () {
		User[] userlist = Userlist.listofUsers;
		return userlist;
	}
	
	public void create(User newUser) {
		
		//Userlist.listofUsers[0] = newUser;
		
		User[] array =Userlist.listofUsers;
		
		for (int i=0;i<array.length;i++) {
			
			User user = array[i];
			
			if(user == null) {
				array[i]=newUser;
			//	user=newUser;
				break;
			}
			
		}
		
		
	}
	public void update(int id, User updatedUser) {
		User[] userList = Userlist.listofUsers;

		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user.getId() == id) {
				userList[i].setFirstName(updatedUser.getFirstName());
				userList[i].setLastName(updatedUser.getLastName());
				break;
			}
		}
	}
	
	public void delete(int userId) {
		User[] userList = Userlist.listofUsers;
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user.getId() == userId) {
				user.setActive(false);
				break;
			}
		}
	}
	
	public User findById(int userId) {
		User[] userList = Userlist.listofUsers;
		User userMatch = null;

		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user.getId() == userId) {
				userMatch = user;
				break;
			}
		}
		return userMatch;
	}
	
	
	
		

}
