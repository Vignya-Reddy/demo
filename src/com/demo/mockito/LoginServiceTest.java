package com.demo.mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import org.mockito.*; 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
 
@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {
	@Mock
	UserRepository userRepositoryMock;
	@Test
	public void testSuccessfulLogin() {
		LoginService loginService = new LoginService(userRepositoryMock);
		String username="testuser";
		String password="password";
		when(userRepositoryMock.authenticate(username,password)).thenReturn(true);
		boolean result=loginService.login(username, password);
		assertTrue(result);	
	}
	@Test
	public void testFailedLogin() {
		LoginService loginService=new LoginService(userRepositoryMock);
		String username="testuser";
		String password="wrongpassword";
		when(userRepositoryMock.authenticate(username,password)).thenReturn(false);
		boolean result=loginService.login(username, password);
		assertFalse(result);
	}
 
}