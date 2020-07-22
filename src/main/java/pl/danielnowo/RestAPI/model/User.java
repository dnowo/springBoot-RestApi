package pl.danielnowo.RestAPI.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;

    @OneToMany(cascade = CascadeType.REMOVE) //Cascade deletion type. Usually ALL
    @JoinColumn(name = "user_id", updatable = false, insertable = false) //From schema.sql for comments table, 'user_id'.
    private List<Comment> commentList;

    public long getId() {
        return id;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
