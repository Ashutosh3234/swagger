package com.example.demo.services;
import com.example.demo.dao.CourseDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.Courses;

@Service
public class CourseServiceimpl implements CourseService {

    @Autowired
	public CourseDao cdao;
	//List<Courses> course;
	/*public  CourseServiceimpl()
	{
	   course = new ArrayList<>();
	   course.add(new Courses(123,"java basic"," awesome course"));
	   course.add(new Courses(122,"dbms basic"," not so awesome course"));
	   
	}*/
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}
	@SuppressWarnings("deprecation")
	@Override
	public Courses getCourse(long id) {
		// TODO Auto-generated method stub
		/*Courses c = null;
		for(Courses cc :course)
		{
			if(cc.getId()==id)
			{
				c = cc;
			}
		}*/
		return cdao.findById(id).get();
	}
	@Override
	public Courses addCourse(Courses c) {
		// TODO Auto-generated method stub
		//course.add(c);
		cdao.save(c);
		return c;
		
	}
	@Override
	public Courses updateCourse(Courses c) { //id same so change the name
		/*Courses cc = null;
		for(Courses cd : course)
		{
			if(cd.getId()== c.getId())
			{
				cc = cd;
				cc.setTitle(c.getTitle());
				cc.setDiscription(c.getDiscription());
				
			}
			
		}*/
		cdao.save(c);
		return c;
	}
	@Override
	public String deleteCourse(long id) {
		// TODO Auto-generated method stub
		/*Courses c = null;
		for(Courses cc : course)
		{
			if(cc.getId()== id)
			{
				c = cc;
				course.remove(cc);
				break;
			}
		}*/
		@SuppressWarnings("deprecation")
		Courses cs = cdao.findById(id).get(); //findById.isPresent()e
		cdao.delete(cs);
		return "Done";
	}


	}


