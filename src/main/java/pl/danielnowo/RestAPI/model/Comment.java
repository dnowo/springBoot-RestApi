package pl.danielnowo.RestAPI.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;
}