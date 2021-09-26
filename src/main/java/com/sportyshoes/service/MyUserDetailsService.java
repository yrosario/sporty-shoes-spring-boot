package com.sportyshoes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.User;
import com.sportyshoes.repository.MyUserDetails;
import com.sportyshoes.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<User> user = userRepository.findByUserName(userName);
		try{
			return user.map(MyUserDetails::new).get();
		}catch(Exception e) {
			System.out.println("User not found " + userName);
			return user.map(MyUserDetails::new).get();

		}
		
	}
	
}
