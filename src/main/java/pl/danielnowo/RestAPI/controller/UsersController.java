package pl.danielnowo.RestAPI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/names")
    public List<User> getByNames(){ return userService.getByNames("Name [4]"); }

    @PostMapping("/post")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/put")
    public User editUser(@RequestBody User user){
        return userService.editUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }
}
