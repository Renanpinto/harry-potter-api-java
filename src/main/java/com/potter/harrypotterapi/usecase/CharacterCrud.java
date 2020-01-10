package com.potter.harrypotterapi.usecase;

import com.potter.harrypotterapi.domains.CharacterHP;
import com.potter.harrypotterapi.gateway.CharacterGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CharacterCrud {

    private final CharacterGateway gateway;

    public List<CharacterHP> findByName(final String name) {
        return gateway.findByName(name);
    }

}
