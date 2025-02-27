package org.example.demo.factory.enumeration;

import org.example.demo.factory.enumeration.mapping.MappeEnfant;
import org.example.demo.factory.enumeration.mapping.MappePersonne;
import java.util.function.Supplier;

public enum EnumFactory {
    PERSONNE(MappePersonne::new),
    ENFANT(MappeEnfant::new);

    private final Supplier<Mapper<?>> mapperSupplier;

    EnumFactory(Supplier<Mapper<?>> mapperSupplier) {
        this.mapperSupplier = mapperSupplier;
    }

    public <T> Mapper<T> getNewInstance(Class<T> clazz) {
        Mapper<?> mapper = mapperSupplier.get();
        if (clazz.isInstance(mapper.convert(""))) {
            return (Mapper<T>) mapper;
        } else {
            throw new IllegalArgumentException("Incompatible mapper type");
        }
    }
}
