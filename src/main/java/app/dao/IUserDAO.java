package app.dao;

import java.util.List;

import app.model.User;

public interface IUserDAO {
	
	List<User> getUsers();
	
	User getById(int id);
	
	void save(User user);
	
	void update(User user);
	
	void delete(int id);

}
