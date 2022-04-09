package com.codekul.JavaSpring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private  UserRepository userRepository;

    @PostMapping("saveUser")
    public String saveUser(@RequestBody User user){
     userRepository.save(user);
        return "user saved";


    }
    @GetMapping("getUserList")
    public List<User> getUserDetail(){
        List<User>userList = userRepository.findAll();
        return userList;

    }

    @PutMapping("updateUser")
    public String update(@RequestBody User newUser ){
        User old = userRepository.getById(newUser.getId());
        old.setAddress(newUser.getAddress());
        old.setContactNo(newUser.getContactNo());
        old.setEmail(newUser.getEmail());
        old.setGender(newUser.getGender());
        old.setName(newUser.getName());

        userRepository.save(old);
        return "updated user";

    }
    @DeleteMapping("deleteUserByEntity")
    public  String delete(@RequestBody User user){
        userRepository.delete(user);
        return "deleted user";
    }
}
