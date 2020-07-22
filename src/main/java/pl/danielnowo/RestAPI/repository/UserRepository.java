package pl.danielnowo.RestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.danielnowo.RestAPI.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.name = :name")
    /**
     * Or by keywords inside method names like: findAllByName without @Query
     * @see https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
     */
    List<User> findAllByName(@Param("name") String name);

    @Query("SELECT u FROM User u" +
            " LEFT JOIN FETCH u.commentList") //commentList from User @OneToMany.
    List<User> findAllUsers();

}
