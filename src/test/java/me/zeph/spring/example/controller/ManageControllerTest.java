package me.zeph.spring.example.controller;

import me.zeph.spring.example.controller.ManageController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ManageControllerTest {

	private ManageController manageController;

	@Before
	public void setUp() throws Exception {
		manageController = new ManageController();
	}

	@Test
	public void shouldGoToManagePage() {
		//when
		String viewName = manageController.view();

		//then
		assertThat(viewName, is("manage"));
	}

	@Test
	public void shouldChangePassword() {
		//given
		ExtendedModelMap model = new ExtendedModelMap();

		//when
		String viewName = manageController.changePassword(model);

		//then
		assertThat(viewName, is("manage"));
		assertThat((String) model.get("result"), is("alert-error.jsp"));
	}

}
