package pl.warelis.flashcards.controller;

import org.springframework.web.bind.annotation.*;
import pl.warelis.flashcards.model.AloneWord;
import pl.warelis.flashcards.repository.AloneWordRepository;

import java.util.List;

@RestController
public class FiszkiController {

    private final AloneWordRepository repository;
    public FiszkiController(AloneWordRepository repository) {
        this.repository = repository;
    }



    @GetMapping("/fiszki")
    public List<AloneWord> getAll(){
        return repository.findAll();
    }

    @GetMapping("/fiszki/{id}")
    public AloneWord findOneById(@PathVariable Long id){
        return repository.findById(id).get();
    @PostMapping("/fiszki")
    public AloneWord save(@RequestBody AloneWord aloneWord){
        return repository.saveAndFlush(aloneWord);
    }
    @GetMapping("/test")
    public String inti(){
        AloneWord aloneWord = new AloneWord();
        aloneWord.setPlWord("kot");
        aloneWord.setEngWord("cat");
        repository.saveAndFlush(aloneWord);
        return"";
    }
    @DeleteMapping("/fiszki/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
