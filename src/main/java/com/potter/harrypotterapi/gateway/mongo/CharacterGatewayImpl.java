package com.potter.harrypotterapi.gateway.mongo;

import com.potter.harrypotterapi.domains.CharacterHP;
import com.potter.harrypotterapi.gateway.CharacterGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CharacterGatewayImpl implements CharacterGateway {

    private final CharacterRepository repository;

    @Override
    public CharacterHP save(final CharacterHP generatedUrl) {
        return repository.save(generatedUrl);
    }

    @Override
    public List<CharacterHP> findByName(final String name) {
        return repository.findByName(name);
    }

    @Override
    public void delete(final String id) {
        repository.deleteById(id);
    }

}
