package org.example.demo.factory.enumeration.mapping;

import org.example.demo.factory.enumeration.Mapper;
import org.example.demo.factory.enumeration.model.Personne;

public class MappePersonne extends Mapper<Personne> {
    @Override
    public Personne convert(String value) {
        return new Personne(value);
    }
}
