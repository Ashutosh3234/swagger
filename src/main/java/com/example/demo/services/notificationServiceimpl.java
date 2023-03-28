package com.example.demo.services;
import java.util.*;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.dao.NotiDao;
import com.example.demo.entities.notofication;

@Service
public class notificationServiceimpl implements notificationService {

	@Autowired
	public NotiDao ndao;
	@Override
	public List<notofication> getnotification() {
		// TODO Auto-generated method stub
		List<notofication> arr = new ArrayList<notofication>();
		List<notofication> ar  = ndao.findAll();
	    for(int i =0;i<ar.size();i++)
	    {
	    	notofication nn  = ar.get(i);
	    	byte[] db = Base64.getDecoder().decode(nn.getMessage());
	    	String decodeString = new String(db);
	    	notofication ns = new notofication(nn.getId(),decodeString);
	    	arr.add(ns);
	    }
		
		return arr;
	}

	@Override
	public notofication addNotification(notofication c) {
		// TODO Auto-generated method stub
		String encodedc = Base64.getEncoder().encodeToString(c.getMessage().getBytes());
		c.setMessage(encodedc);
		ndao.save(c);
		return c;
	}

}
