package org.model;

public class Cane extends Animale{

    public Cane(String nome, String genere) {
        super(nome, genere);
    }

    @Override
    void verso() {
        System.out.println("Bau");
    }

    @Override
    void mangia() {
        System.out.println("Mangio crocchette per cani");
    }
}
