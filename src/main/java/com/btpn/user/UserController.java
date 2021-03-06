package com.btpn.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired UserDAO userDao;
	
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public @ResponseBody List<User> getAllUserListFromJsonFile() {
		List<User> userList = (List<User>) userDao.findAll();
		return userList;
	}
}
