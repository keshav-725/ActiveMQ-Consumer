package com.weshopify.platform.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageReceiver {

	@JmsListener(destination = "testmq1")
	public void message(String text) {
		System.out.println("Received message : "+text);
	}
}
