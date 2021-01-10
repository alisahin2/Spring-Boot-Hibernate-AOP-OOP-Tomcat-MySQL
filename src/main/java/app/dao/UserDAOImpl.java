package app.dao;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import app.model.User;

@Repository
public class UserDAOImpl implements IUserDAO {

	private EntityManager entitymanager; 
	
	public UserDAOImpl(EntityManager entitymanager) { // constructor
		this.entitymanager = entitymanager;
	}
	
	
	@Override
	public List<User> getUsers() {
		Session session = entitymanager.unwrap(Session.class);
		Query<User> query = session.createQuery("from User", User.class);
		List<User> users = query.getResultList();
		return users;
	}

	@Override
	public User getById(int id) {
		Session session = entitymanager.unwrap(Session.class);
		User selectedUser =  session.get(User.class, id);
		return selectedUser;
	}

	@Override
	public void save(User user) {
	 	Session session = entitymanager.unwrap(Session.class);
		session.saveOrUpdate(user);
	}

	@Override
	public void update(User user) {
		Session session = entitymanager.unwrap(Session.class);
		session.update(user);
	}

	@Override
	public void delete(int id) {
		Session session = entitymanager.unwrap(Session.class);
		User deleteUser = session.get(User.class,id);
		session.delete(deleteUser);
	}

}
