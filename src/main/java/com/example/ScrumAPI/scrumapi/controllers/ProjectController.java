package com.example.ScrumAPI.scrumapi.controllers;
import com.example.ScrumAPI.scrumapi.models.Project;
import com.example.ScrumAPI.scrumapi.services.ProjectService;
import com.example.ScrumAPI.scrumapi.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @PostMapping("/")
    public ResponseEntity<Map<String, String>> createProject(@RequestBody final Project body){
        projectService.createProject(body);
        return Util.getCreateSuccessResponse("success");
    }
    @PutMapping("/{projectID}")
    public String updateProject(@PathVariable("projectID") final String projectID,@RequestBody final Project body ){
        return "hello world 2";
    }
    @DeleteMapping("/{projectID}")
    public ResponseEntity<Map<String,String>> deleteProject(@PathVariable("projectID") final String projectID) throws Exception {
        projectService.deleteProject(projectID);
        return Util.getDeletSuccessResponse("success");


    }

}
