package com.example.ScrumAPI.scrumapi.models;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "projects")
public class Project {
    @Id
    private String id;
    private String name;
    private String desc;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date modifiedAt;


}
