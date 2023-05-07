package pl.warelis.flashcards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.warelis.flashcards.model.WordSet;

public interface WordSetRepository extends JpaRepository<WordSet, Long> {
    
}
