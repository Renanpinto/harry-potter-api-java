package com.potter.harrypotterapi.domains;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Document(collection = "character")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CharacterHP {

    @Id
    private String id;

    private String name;
    private String species;
    private String gender;
    private String house;
    private String dateOfBirth;
    private BigDecimal yearOfBirth;
    private String ancestry;
    private String eyeColour;
    private String hairColour;
    private Boolean hogwartsStudent;
    private Boolean hogwartsStaff;
    private List<String> actor;
    private Boolean alive;

}
