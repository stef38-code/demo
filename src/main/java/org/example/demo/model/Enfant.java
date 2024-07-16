package org.example.demo.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Enfant {
    private final String prenom;

    public Enfant(String prenom) {

        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("prenom", prenom)
                .toString();
    }
}
