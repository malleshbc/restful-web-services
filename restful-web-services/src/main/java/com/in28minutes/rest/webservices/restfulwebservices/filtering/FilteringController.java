package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("Val1","Val2","Val3");
	}

}
