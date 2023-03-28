package com.example.authentic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.authentic.model.DAOUsers;
@Repository
public interface UserDao extends CrudRepository <DAOUsers, Long> {
	
	DAOUsers findByUsername(String username);
}
