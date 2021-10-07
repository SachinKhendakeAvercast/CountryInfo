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
		// setup
        String password = "";
 
        // execute
        boolean actual = validatePassword(password);
 
        // assert
        assertFalse(actual); 
	}
	
	public static boolean validatePassword(String password) {
		  return true;
		}
	
	
}