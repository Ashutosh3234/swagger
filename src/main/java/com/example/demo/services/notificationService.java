package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;
import com.example.demo.entities.notofication;
@Service
public interface notificationService {

	public List<notofication> getnotification();

	public notofication addNotification(notofication c);

}
