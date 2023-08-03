package com.example.ScrumAPI.scrumapi.dao;

import com.example.ScrumAPI.scrumapi.models.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends MongoRepository<Project,String> {


}
