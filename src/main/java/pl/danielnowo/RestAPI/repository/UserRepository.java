package pl.danielnowo.RestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.danielnowo.RestAPI.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
