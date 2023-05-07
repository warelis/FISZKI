package pl.warelis.flashcards.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class AloneWord {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "AloneWord_WordSet",
            joinColumns = @JoinColumn(name = "AloneWord_id"),
            inverseJoinColumns = @JoinColumn(name = "WordSet_id")
    )
    private Set<WordSet> wordsWithTrans;//
    private String plWord;
    private String engWord;
}

