package com.example.ScrumAPI.scrumapi.models;

import lombok.Data;
// import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.security.Timestamp;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String email;
    private String name;
    private String password;
//    @CreatedDate
//    private Timestamp regDate;

}
