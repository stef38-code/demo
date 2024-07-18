package org.example.demo.factory.enumeration;

import org.example.demo.factory.enumeration.mapping.MappeEnfant;
import org.example.demo.factory.enumeration.mapping.MappePersonne;

import org.example.demo.factory.enumeration.model.Enfant;
import org.example.demo.factory.enumeration.model.Personne;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MyFactoryClassTest {

    @Test
    void obtenirInstancePourPersonneDoitRetournerMapperPersonne() {
        Mapper<Personne> mapper = MyFactoryClass.PERSONNE.getNewInstance(Personne.class);
        assertThat(mapper).isNotNull();
        assertThat(mapper).isInstanceOf(MappePersonne.class);
    }

    @Test
    void obtenirInstancePourEnfantDoitRetournerMapperEnfant() {
        Mapper<Enfant> mapper = MyFactoryClass.ENFANT.getNewInstance(Enfant.class);
        assertThat(mapper).isNotNull();
        assertThat(mapper).isInstanceOf(MappeEnfant.class);
    }

    @Test
    void obtenirInstanceAvecTypeIncompatibleDoitLeverException() {
        assertThatThrownBy(() -> MyFactoryClass.PERSONNE.getNewInstance(Enfant.class))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Incompatible mapper type");
    }

    @Test
    void obtenirInstanceAvecClasseNulleDoitLeverNullPointerException() {
        assertThatThrownBy(() -> MyFactoryClass.PERSONNE.getNewInstance(null))
                .isInstanceOf(NullPointerException.class);
    }
}
