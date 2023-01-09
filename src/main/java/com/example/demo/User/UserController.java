package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping(path = "api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public void registerNewUser(@RequestBody WebUser webUser){
        userService.addNewUser(webUser);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long id){
        userService.deleteUser(id);
    }


    @GetMapping("api/v1/users/{username}/{password}")
    @ResponseBody
    @CrossOrigin
    public Long isValidLogin(@PathVariable String username, @PathVariable String password){
        return userService.isValidLogin(username,password);
    }

}
