package com.potter.harrypotterapi.gateway;

import com.potter.harrypotterapi.domains.CharacterHP;

import java.util.List;

public interface CharacterGateway {

    CharacterHP save(CharacterHP generatedUrl);

    List<CharacterHP> findByName(String name);

    void delete(String id);

}
