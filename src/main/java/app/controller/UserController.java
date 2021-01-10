package app.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.User;
import app.service.IUserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	public UserController(IUserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public List<User> get(){
		return userService.getUsers();
	}
	
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		userService.save(user);
		return user;
	}
	
	@PutMapping("/update")
	public User update(@RequestBody User user) {
		userService.update(user);
		return user;
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {
		User selectedUser = userService.getById(id);
		if(selectedUser == null) {
			//throw new RuntimeException("id: " + id + " is not found ");
			System.out.println("id: " + id + "is not found");
		}
		return selectedUser;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		userService.delete(id);
		return "User is deleted" + id ;
	}
	

}
