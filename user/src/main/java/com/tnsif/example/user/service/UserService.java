package com.tnsif.example.user.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tnsif.example.user.model.User;
import com.tnsif.example.user.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User addUser(User user) {
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User getUserById(int id) {
        return repo.findById(id).orElse(null);
    }

    public User updateUser(User user,Integer id) {
     
    	User us =repo.findById(id).orElseThrow(()->new RuntimeException("User Not Found of Id: "+id));
    	us.setName(user.getName());
    	us.setPassword(user.getPassword());
    	us.setType(user.getType());
    	return repo.save(us);
    }

    public void deleteUser(@PathVariable Integer id) {
    	User us=repo.findById(id).orElseThrow(()->new RuntimeException("User Not Found of Id: "+id));
        
		 repo.delete(us);
		 
        
    }
}
