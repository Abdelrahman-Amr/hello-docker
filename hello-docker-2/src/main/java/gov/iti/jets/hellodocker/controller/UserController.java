package gov.iti.jets.hellodocker.controller;

import gov.iti.jets.hellodocker.repository.UserRepository;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import gov.iti.jets.hellodocker.entity.User;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<String> post(@RequestBody User user)
    {
         userRepository.save(user);
         return new ResponseEntity<>("User has been added successfully", HttpStatus.OK);
    }
}
