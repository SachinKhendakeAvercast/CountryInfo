package com.avercast.service;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

@Service
public class MTService {

	public Map<String, String> getCountryCode() {

		String[] countryCodes = Locale.getISOCountries();
		Locale obj = null;

		final Map<String, String> map = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);

		for (String countryCode : countryCodes) {
			obj = new Locale("", countryCode);
			map.put(obj.getCountry(), obj.getDisplayCountry());
		}

		return map;
	}

	public String getAppInfo() {

		String appInfo = "Contry Info App";

		return appInfo;
	}

}
