package com.microservice.limits.limitservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.limits.limitservices.bean.*;
import com.microservice.limits.limitservices.bean.LimitConfiguration;

@RestController
public class limitConfigController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration reteriveAlllimit() {
		
		return new LimitConfiguration(configuration.getMaximum(),
				configuration.getMinimum());
	}

}
