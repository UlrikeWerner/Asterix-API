package com.github.UlrikeWerner.Controller;

import com.github.UlrikeWerner.Entities.AsterixCharacter;
import com.github.UlrikeWerner.Repositories.CharacterRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/AsterixAPI/api")
public class AsterixController {
    private final CharacterRepo characterRepo;

    public AsterixController(CharacterRepo characterRepo){
        this.characterRepo = characterRepo;
    }

    @GetMapping("asterixCharacters")
    public List<AsterixCharacter> getAsterixCharacterList() {
        return characterRepo.findAll();
    }
}
