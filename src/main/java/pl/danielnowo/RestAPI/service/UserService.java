package pl.danielnowo.RestAPI.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.danielnowo.RestAPI.model.User;
import pl.danielnowo.RestAPI.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAllUsers();
    }

    public User getSingleUser(long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public List<User> getByNames(String name){
        return userRepository.findAllByName(name);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Transactional //Adds one transaction. "Dirty Checking hibernate"
    public User editUser(User user) {
        User editedUser = userRepository.findById(user.getId()).orElseThrow();
        editedUser.setName(user.getName());
        editedUser.setSurname(user.getSurname()); //Hibernate sees that entity has been edited.
        return editedUser;
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
