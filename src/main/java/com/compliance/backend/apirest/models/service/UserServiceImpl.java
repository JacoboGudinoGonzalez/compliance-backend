package com.compliance.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.compliance.backend.apirest.models.dao.IUserDAO;
import com.compliance.backend.apirest.models.entity.User;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDAO userDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<User> findAll() {
		return (List<User>) userDao.findAll();
	}

}
