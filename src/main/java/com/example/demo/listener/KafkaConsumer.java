package com.example.demo.listener;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class KafkaConsumer {

	
	@KafkaListener(topics="test", groupId ="group_id")
	public void consume(User user) {
		System.out.println("Consumed JSON message==="+user);
	}
	
}
