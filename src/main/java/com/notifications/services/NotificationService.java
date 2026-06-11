package com.notifications.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.notifications.dtos.NotificationMessage;

@Service
public class NotificationService {
	@Autowired
	private SimpMessagingTemplate template;

	public void broadCastToAll(NotificationMessage message) {
		template.convertAndSend("/topic/notifications", message);
	}
}
