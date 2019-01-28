package com.plane.tickets.project.sellingplanetickets.security.services;

import com.plane.tickets.project.sellingplanetickets.model.User;
import com.plane.tickets.project.sellingplanetickets.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
    UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException("User Not Found with -> username or email : " + username));

		return UserPrinciple.build(user);
	}

	public User findUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException("User Not Found with -> username or email : " + username));

		return user;
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
}