package com.saha.vehicleManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.User;
import com.saha.vehicleManagement.repositories.UserRepository;

@Service
public class UserService {
	@Autowired private BCryptPasswordEncoder encoder;
	
    @Autowired
    private UserRepository userRepository;
	public void save(User user) {
		// TODO Auto-generated method stub
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
	}

}
