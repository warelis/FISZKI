package pl.warelis.flashcards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.warelis.flashcards.model.AloneWord;

public interface AloneWordRepository extends JpaRepository<AloneWord, Long> {
 
}
