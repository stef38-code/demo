package org.example.demo;

import org.example.demo.mapping.MappeEnfant;
import org.example.demo.mapping.MappePersonne;
import org.example.demo.model.Enfant;
import org.example.demo.model.Personne;

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
