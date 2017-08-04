package com.btpn.user;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDao;
	
	public User findByUserId(Integer userId) {
		return userDao.findByUserId(userId);
	}
	
	public List<User> findAllUser() {
		return (List<User>) userDao.findAll();
	}
	
	public void saveUser(User user) {
		userDao.save(user);
	}
}
