package org.example.demo.factory.enumeration.mapping;

import org.example.demo.factory.enumeration.Mapper;
import org.example.demo.factory.enumeration.model.Enfant;

public class MappeEnfant extends Mapper<Enfant> {
    @Override
    public Enfant convert(String value) {
        return new Enfant(value);
    }
}
