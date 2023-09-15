package com.github.UlrikeWerner.Repositories;

import com.github.UlrikeWerner.Entities.AsterixCharacter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepo extends MongoRepository<AsterixCharacter, String> {
    //List<AsterixCharacter> getAsterixCharacterList();
}
