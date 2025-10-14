package com.tnsif.example.user.controls;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tnsif.example.user.model.User;
import com.tnsif.example.user.service.UserService;

@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    
    private UserService service;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable int id) {
//        return service.getUserById(id);
//    }

    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Integer id) {
        return service.updateUser(user,id);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
    	try {
          service.deleteUser(id);
          return ResponseEntity.ok("Successfully Deleted with Id:"+id);
        }
    	catch(Exception e)
    	{
    		 throw new RuntimeException("User Not Found with Id:"+id);
    	}
    }
}
    