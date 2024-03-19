package com.demo.mockito;

public class LoginService {
	private UserRepository userRepository;
	public LoginService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	public boolean login(String username, String password) {
		return userRepository.authenticate(username, password);
	}
}