package com.spring.eventdriven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventDrivenController {
	@Autowired
	private EventService service;
	
	@PostMapping("/")
	public String add(@RequestBody EventInputDto inputDto) {
		this.service.add(inputDto.name());
		return "success";
	}
}
