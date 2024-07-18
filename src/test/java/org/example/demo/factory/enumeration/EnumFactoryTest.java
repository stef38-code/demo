package org.example.demo.factory.enumeration;

import org.example.demo.factory.enumeration.model.Enfant;
import org.example.demo.factory.enumeration.model.Personne;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EnumFactoryTest {
    @Test
    void mappingPersonne(){
        Mapper<Personne> personneMapping = EnumFactory.PERSONNE.getNewInstance(Personne.class);
        Personne personne = personneMapping.convert("Robert");
        assertThat(personne.getPrenom()).hasToString("Robert");
    }
    @Test
    void mappingPersonne2(){
        Mapper<Personne> personneMapping = EnumFactory.valueOf("PERSONNE").getNewInstance(Personne.class);
        Personne personne = personneMapping.convert("Robert");
        assertThat(personne.getPrenom()).hasToString("Robert");
    }
    @Test
    void mappingEnfant(){
        Mapper<Enfant> personneMapping = EnumFactory.ENFANT.getNewInstance(Enfant.class);
        Enfant enfant = personneMapping.convert("Julien");
        assertThat(enfant.getPrenom()).hasToString("Julien");
    }
    @Test
    void mappingEnfant2(){
        Mapper<Enfant> personneMapping = EnumFactory.valueOf("ENFANT").getNewInstance(Enfant.class);
        Enfant enfant = personneMapping.convert("Julien");
        assertThat(enfant.getPrenom()).hasToString("Julien");
    }
}
