package com.compliance.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.compliance.backend.apirest.models.entity.User;

public interface IUserDAO extends CrudRepository<User, Long> {

}
