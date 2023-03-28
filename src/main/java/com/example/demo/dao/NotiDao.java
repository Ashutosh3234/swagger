package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.notofication;
@Repository
public interface NotiDao extends MongoRepository<notofication , Long>{

}
