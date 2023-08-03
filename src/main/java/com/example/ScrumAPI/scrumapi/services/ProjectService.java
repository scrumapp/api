package com.example.ScrumAPI.scrumapi.services;

import com.example.ScrumAPI.scrumapi.controllers.ProjectController;
import com.example.ScrumAPI.scrumapi.dao.ProjectRepo;
import com.example.ScrumAPI.scrumapi.models.Project;
import com.example.ScrumAPI.scrumapi.utils.exception.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    ProjectRepo repo;

    public void createProject(Project project){
        repo.save(project);

    }
    public void deleteProject(String id) throws Exception {
        Optional<Project> project = repo.findById(id);
        if (project.isEmpty()) {
            throw new NotFound("Not Found");
        }
        repo.deleteById(id);

    }
}
