package com.saha.vehicleManagement.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.User;
import com.saha.vehicleManagement.models.UserPrincipal;
import com.saha.vehicleManagement.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
    
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user=userRepository.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		
		return new UserPrincipal(user);
	}

}
