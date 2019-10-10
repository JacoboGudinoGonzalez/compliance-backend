package com.compliance.backend.apirest.models.service;

import java.util.List;

import com.compliance.backend.apirest.models.entity.User;

public interface IUserService {

	public List<User> findAll();
}
