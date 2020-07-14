package pl.danielnowo.RestAPI.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.danielnowo.RestAPI.model.User;
import pl.danielnowo.RestAPI.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User getSingleUser(long id){
        return userRepository.findById(id).orElseThrow();
    }
}
