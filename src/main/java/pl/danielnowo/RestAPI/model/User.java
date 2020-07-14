package pl.danielnowo.RestAPI.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    private long id;
    private String name;
    private String surname;
}
