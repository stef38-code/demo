package org.example.demo.factory.enumeration;

import org.example.demo.factory.enumeration.mapping.MappeEnfant;
import org.example.demo.factory.enumeration.mapping.MappePersonne;
import org.example.demo.factory.enumeration.model.Enfant;
import org.example.demo.factory.enumeration.model.Personne;

@SuppressWarnings("unchecked")
public enum EnumFactory {
    PERSONNE {
        @Override
        public Mapper<Personne> getNewInstance() {
            return new MappePersonne();
        }
    },
    ENFANT {
        @Override
        public Mapper<Enfant> getNewInstance() {
            return new MappeEnfant();
        }
    };


    public abstract <T> Mapper<T> getNewInstance();
}
