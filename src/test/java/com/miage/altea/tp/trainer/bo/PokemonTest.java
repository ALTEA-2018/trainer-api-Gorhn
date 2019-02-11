package com.miage.altea.tp.trainer.bo;

import static org.junit.Assert.assertNotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.junit.jupiter.api.Test;

public class PokemonTest {

    @Test
    void pokemon_shouldBeAnEntity(){
        assertNotNull(Pokemon.class.getAnnotation(Entity.class)); 
    }

    @Test
    void pokemonId_shouldBeAGeneratedId() throws NoSuchFieldException {
        assertNotNull(Pokemon.class.getDeclaredField("id").getAnnotation(Id.class)); 
        assertNotNull(Pokemon.class.getDeclaredField("id").getAnnotation(GeneratedValue.class)); 
    }

}