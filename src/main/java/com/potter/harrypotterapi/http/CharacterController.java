package com.potter.harrypotterapi.http;

import com.potter.harrypotterapi.domains.CharacterHP;
import com.potter.harrypotterapi.usecase.CharacterCrud;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterCrud crud;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "characters", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CharacterHP> getCharacters(@RequestHeader(value = "name") final String name) {
        return crud.findByName(name);
    }

}
