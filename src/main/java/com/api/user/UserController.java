package com.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAllUsers(){
        return (List<User>) userRepository.findAll();
    }
    @GetMapping("/{id}")
    public User findUserById(@PathVariable(value = "id")Long id){
            return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }
    @PostMapping
    public User saveUser(@Validated @RequestBody User user){
        return userRepository.save(user);
    }

}
