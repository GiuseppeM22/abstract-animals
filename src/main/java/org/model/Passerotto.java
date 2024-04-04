package org.model;

public class Passerotto extends Animale implements Volo{

    public Passerotto(String nome, String genere) {
        super(nome, genere);
    }

    @Override
    void verso() {
        System.out.println("Cip Cip");
    }

    @Override
    void mangia() {
        System.out.println("Mangio i semi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }
}
