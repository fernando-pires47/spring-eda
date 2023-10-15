package com.spring.eventdriven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventService {
	@Autowired
	private ApplicationEventPublisher publisher;

	public void add(String name) {
		System.out.println("Publish Event: "+ name);
		this.publisher.publishEvent(new Event(name));
	}
}
