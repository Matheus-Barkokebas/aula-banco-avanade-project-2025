package me.dio.avanade.service;

import me.dio.avanade.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User userToCreate);
}
