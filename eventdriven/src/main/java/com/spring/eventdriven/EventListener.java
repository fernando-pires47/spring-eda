package com.spring.eventdriven;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventListener {
	@Async
	@org.springframework.context.event.EventListener
	public void handler(Event event) {
		System.out.println("Listening event: "+ event.name());
	}
}
