package me.zeph.spring.example.controller;

import me.zeph.spring.example.controller.WelcomeController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import sun.security.acl.PrincipalImpl;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WelcomeControllerTest {

	private WelcomeController welcomeController;
	private ExtendedModelMap model;
	private PrincipalImpl principal;

	@Before
	public void setUp() throws Exception {
		welcomeController = new WelcomeController();
		model = new ExtendedModelMap();
		principal = new PrincipalImpl("username");
	}

	@Test
	public void shouldGoToWelcomePage() {
		//given

		//when
		String viewName = welcomeController.welcome(model, principal);
		String username = principal.getName();

		//then
		assertThat(viewName, is("index"));
		assertThat(username, is("username"));
	}

	@Test
	public void shouldGoToWelcomePageWhenRequestIndex() {
		//given

		//when
		String viewName = welcomeController.welcomeView(model, principal);
		String username = principal.getName();

		//then
		assertThat(viewName, is("index"));
		assertThat(username, is("username"));
	}

}
