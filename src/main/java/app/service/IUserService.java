package app.service;

import java.util.List;

import app.model.User;

public interface IUserService {
	
	List<User> getUsers();
	
	User getById(int id);
	
	void save(User user);
	
	void update(User user);
	
	void delete(int id);

}
