package me.zeph.spring.example.controller;

import me.zeph.spring.example.controller.AboutController;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AboutControllerTest {

	@Test
	public void shouldGoToAboutPage() {
		//given
		AboutController aboutController = new AboutController();

		//when
		String viewName = aboutController.view();

		//then
		assertThat(viewName, is("about"));
	}
}
