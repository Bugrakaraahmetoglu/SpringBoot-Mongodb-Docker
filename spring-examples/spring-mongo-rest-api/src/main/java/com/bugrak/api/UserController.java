package com.bugrak.api;

import com.bugrak.entitiy.User;
import com.bugrak.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
private UserRepository userRepository;

@PostMapping("/add")
    public ResponseEntity <User> add(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user)) ;
    }

    @GetMapping("/get")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userRepository.findAll()) ;
    }
}
