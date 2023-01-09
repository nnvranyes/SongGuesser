package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final WebUserRepository userRepository;

    @Autowired
    public UserService(WebUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<WebUser> getUsers(){
        return userRepository.findAll();
    }

    public void addNewUser(WebUser webUser) {
        Optional<WebUser> userOptional = userRepository.findWebUserByUserName(webUser.getUserName());
        if(userOptional.isPresent()){
            throw new IllegalStateException("user name taken");
        }
        userRepository.save(webUser);
        System.out.println(webUser.toString());
    }

    public void deleteUser(Long id){
        if(!userRepository.existsById(id)){
            throw new IllegalStateException("Student with id: " + id + " does not exist");
        }
        userRepository.deleteById(id);
    }

    public Long isValidLogin(String username, String password){
        Optional<WebUser> userOptional = userRepository.findWebUserByUserName(username);
        if(userOptional.isPresent()){
            if(userOptional.get().getPassword().equals(password)){
                return userOptional.get().getUserId();
            }
        }
        return 0L;
    }
}
