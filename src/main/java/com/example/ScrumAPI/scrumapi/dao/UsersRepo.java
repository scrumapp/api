package com.example.ScrumAPI.scrumapi.dao;

import com.example.ScrumAPI.scrumapi.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends MongoRepository<User,String > {

}
