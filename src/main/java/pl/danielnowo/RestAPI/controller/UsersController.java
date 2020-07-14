package pl.danielnowo.RestAPI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.danielnowo.RestAPI.model.User;
import pl.danielnowo.RestAPI.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getSingleUser(@PathVariable long id){
        return userService.getSingleUser(id);
    }
}
