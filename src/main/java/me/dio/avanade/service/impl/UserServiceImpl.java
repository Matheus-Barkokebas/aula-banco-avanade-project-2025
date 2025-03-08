package me.dio.avanade.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.avanade.domain.model.User;
import me.dio.avanade.domain.repository.UserRepository;
import me.dio.avanade.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account number already exists");
		}
		return userRepository.save(userToCreate);
	}

}
