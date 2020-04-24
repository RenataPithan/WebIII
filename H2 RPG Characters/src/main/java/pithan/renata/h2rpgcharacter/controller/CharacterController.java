/**
 * Controller for Character.
 * @author  Renata
 * @version 1.0
 * @since   24/04/2020
 */

package pithan.renata.h2rpgcharacter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pithan.renata.h2rpgcharacter.model.CharacterEntity;
import pithan.renata.h2rpgcharacter.repository.CharacterRepository;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping
    public ResponseEntity<List<CharacterEntity>> findAll() {

        return new ResponseEntity<List<CharacterEntity>>((List<CharacterEntity>) this.characterRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")

    public ResponseEntity<CharacterEntity> findById(@PathVariable("id") long id) {

        if(this.characterRepository.findById(id).isPresent()){
            return new ResponseEntity<CharacterEntity>(
                    this.characterRepository.findById(id).get(),
                    new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<CharacterEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping

    public ResponseEntity<CharacterEntity> store (@RequestBody CharacterEntity characterEntity) {

        return new ResponseEntity<CharacterEntity>(
                this.characterRepository.save(characterEntity),
                new HttpHeaders(),
                HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<CharacterEntity> update (@PathVariable("id") long id,
                                                   @RequestBody CharacterEntity characterEntity) throws Exception{
        if(id == 0 || !this.characterRepository.existsById(id)){
            throw new Exception("Error! Invalid ID.");

        }

        return new ResponseEntity<CharacterEntity>(
                this.characterRepository.save(characterEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<CharacterEntity> delete (@PathVariable("id") long id) {

        this.characterRepository.deleteById(id);
        return new ResponseEntity<CharacterEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
