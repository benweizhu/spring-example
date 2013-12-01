package me.zeph.spring.example.controller;

import me.zeph.spring.example.controller.LoginController;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoginControllerTest {

	@Test
	public void shouldGoToLoginPage() {
		//given
		LoginController loginController = new LoginController();

		//when
		String viewName = loginController.view();

		//then
		assertThat(viewName, is("login"));
	}

}
