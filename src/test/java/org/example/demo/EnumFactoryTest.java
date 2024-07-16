package org.example.demo;

import org.example.demo.mapping.MappePersonne;
import org.example.demo.model.Enfant;
import org.example.demo.model.Personne;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EnumFactoryTest {
    @Test
    void mappingPersonne(){
        Mapper<Personne> personneMapping = EnumFactory.PERSONNE.getNewInstance();
        Personne personne = personneMapping.convert("Robert");
        assertThat(personne.getPrenom()).hasToString("Robert");
    }
    @Test
    void mappingPersonne2(){
        Mapper<Personne> personneMapping = EnumFactory.valueOf("PERSONNE").getNewInstance();
        Personne personne = personneMapping.convert("Robert");
        assertThat(personne.getPrenom()).hasToString("Robert");
    }
    @Test
    void mappingEnfant(){
        Mapper<Enfant> personneMapping = EnumFactory.ENFANT.getNewInstance();
        Enfant enfant = personneMapping.convert("Robert");
        assertThat(enfant.getPrenom()).hasToString("Robert");
    }
}
