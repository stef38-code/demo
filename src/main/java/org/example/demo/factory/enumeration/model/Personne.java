package org.example.demo.factory.enumeration.model;

public class Personne {
    private final String prenom;

    public Personne(String prenom) {

        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("prenom", prenom)
                .toString();
    }
}
