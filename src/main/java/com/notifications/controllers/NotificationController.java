package com.notifications.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notifications.dtos.NotificationMessage;
import com.notifications.services.NotificationService;

@RestController
@RequestMapping("/notify")
public class NotificationController 
{
	@Autowired
	private  NotificationService service;
	
   @PostMapping
   public void notify(@RequestBody NotificationMessage message)
   {
	   service.broadCastToAll(message);
   }
}
