package pl.warelis.flashcards.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class WordSet {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @ManyToMany(mappedBy = "wordsWithTrans")
    private Set<AloneWord> onlyWords;
    private String title;



}
