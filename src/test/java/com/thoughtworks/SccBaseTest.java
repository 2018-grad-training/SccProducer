package com.thoughtworks;

import com.thoughtworks.controller.UserController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public abstract class SccBaseTest {
	@Before
	public void setUp() throws Exception {
		RestAssuredMockMvc.standaloneSetup(UserController.class);
	}
}
