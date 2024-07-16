package org.example.demo.mapping;

import org.example.demo.Mapper;
import org.example.demo.model.Enfant;
import org.example.demo.model.Personne;

public class MappeEnfant extends Mapper<Enfant> {
    @Override
    public Enfant convert(String value) {
        return new Enfant(value);
    }
}
