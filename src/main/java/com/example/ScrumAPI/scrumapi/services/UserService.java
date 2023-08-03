package com.example.ScrumAPI.scrumapi.services;

import com.example.ScrumAPI.scrumapi.dao.UsersRepo;
import com.example.ScrumAPI.scrumapi.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UsersRepo repo;

    public void createUser(User body){

        repo.save(body);

    }
}
