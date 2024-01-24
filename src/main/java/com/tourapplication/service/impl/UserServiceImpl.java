package com.tourapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tourapplication.dto.UserDTO;
import com.tourapplication.exception.NotFoundException;
import com.tourapplication.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<UserDTO> getAllUsers() {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO getUserById(Long userId) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO updateUser(Long userId, UserDTO userDTO) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteUserById(Long userId) throws NotFoundException {
		// write your logic here
		return false;
	}
}