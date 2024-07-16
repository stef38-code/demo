package org.example.demo.mapping;

import org.example.demo.Mapper;
import org.example.demo.model.Personne;

public class MappePersonne extends Mapper<Personne> {
    @Override
    public Personne convert(String value) {
        return new Personne(value);
    }
}
