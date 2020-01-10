package com.potter.harrypotterapi.gateway.mongo;

import com.potter.harrypotterapi.domains.CharacterHP;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CharacterRepository extends MongoRepository<CharacterHP, String> {

    List<CharacterHP> findByName(String name);

}
