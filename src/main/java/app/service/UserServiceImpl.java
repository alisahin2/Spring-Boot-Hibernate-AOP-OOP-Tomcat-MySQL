package app.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.dao.IUserDAO;
import app.model.User;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDAO userDAO;

	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public User getById(int id) {
		return userDAO.getById(id);
	}

	@Override
	@Transactional
	public void save(User user) {
		userDAO.save(user);
	}

	@Override
	@Transactional
	public void update(User user) {
		userDAO.update(user);
	}

	@Override
	@Transactional
	public void delete(int id) {
		userDAO.delete(id);
		
	}

}
