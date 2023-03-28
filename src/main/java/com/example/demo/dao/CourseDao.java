package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Courses;
@Repository
public interface CourseDao extends MongoRepository<Courses , Long>{

}
