package org.example.demo.factory.enumeration;
import org.example.demo.factory.enumeration.mapping.MappeEnfant;
import org.example.demo.factory.enumeration.mapping.MappePersonne;
import java.util.function.Supplier;

public class MyFactoryClass {
    public static final MyFactoryClass PERSONNE = new MyFactoryClass(MappePersonne::new);
    public static final MyFactoryClass ENFANT = new MyFactoryClass(MappeEnfant::new);

    private final Supplier<Mapper<?>> mapperSupplier;

    private MyFactoryClass(Supplier<Mapper<?>> mapperSupplier) {
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
