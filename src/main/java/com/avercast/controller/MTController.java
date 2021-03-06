package com.avercast.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avercast.service.MTService;

@RestController
@RequestMapping("/api")
public class MTController {

	@Autowired
	MTService mtService;

	@GetMapping("/country")
	public Map<String, String> getCountryCode() {

		return mtService.getCountryCode();
	}

	@GetMapping("/info")
	public String AppInfo() {
		return mtService.getAppInfo();
		
	}
}
