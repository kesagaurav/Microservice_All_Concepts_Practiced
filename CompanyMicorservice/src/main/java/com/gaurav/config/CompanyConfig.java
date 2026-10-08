package com.gaurav.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CompanyConfig {
	@Autowired
	RestTemplate template() {
		return new RestTemplate();
	}
}
