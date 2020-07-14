package pl.danielnowo.RestAPI.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    private long id;
    private String name;
    private String surname;

    @OneToMany
    @JoinColumn(name = "user_id") //From schema.sql for comments table, 'user_id'.
    private List<Comment> commentList;
}
