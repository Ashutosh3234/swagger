package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.notofication;
import com.example.demo.services.notificationService;

@RestController
public class notificationController {
	@Autowired
	private notificationService ns;
	
	@GetMapping("/courses/notification")
	public List<notofication> getnotification()
	{
		return this.ns.getnotification();
	}
	@PostMapping(path= "/courses/notification", consumes = "application/json")
	public notofication addNotification(@RequestBody notofication c)
	{
		return this.ns.addNotification(c);
	}

}
