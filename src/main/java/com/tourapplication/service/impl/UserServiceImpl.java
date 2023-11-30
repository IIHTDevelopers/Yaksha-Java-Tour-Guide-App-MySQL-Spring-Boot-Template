package com.tourapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tourapplication.dto.UserDTO;
import com.tourapplication.repo.UserRepository;
import com.tourapplication.service.UserService;

import javassist.NotFoundException;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository = null;

	@Override
	public List<UserDTO> getAllUsers() {
		return null;
	}

	@Override
	public UserDTO getUserById(Long userId) throws NotFoundException {
		return null;
	}

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		return null;
	}

	@Override
	public UserDTO updateUser(Long userId, UserDTO userDTO) throws NotFoundException {
		return null;
	}

	@Override
	public boolean deleteUserById(Long userId) throws NotFoundException {
		return false;
	}
}
