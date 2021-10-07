package com.avercast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.avercast.controller.MTController;
import com.avercast.service.MTService;

class TestMTController {

	@Autowired
	MTService mtService;

	@Test
	public void GetAppInfo() {
		assertEquals("Country Info App.", mtService.getAppInfo().toString());
	}

	@Test
	public void GetCountryCode() {
		assertEquals("Country Info App.", mtService.getCountryCode());
	}

	@Test
	public void GetCountryCodeFail() {
		fail("Fail to fetch country code");
	}

	@Test
	public void ChangeCostWithBlankMpass() {
		String password = "";
		boolean actual = validatePassword(password);
		System.out.println("actual = " + actual);
		assertFalse(actual);
	}

	public static boolean validatePassword(String password) {
		if (password == null || password.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}

}