package org.model;


public class Aquila extends Animale implements Volo{

    public Aquila(String nome, String genere) {
        super(nome, genere);
    }

    @Override
    void verso() {
        System.out.println("Chop Chop");
    }

    @Override
    void mangia() {
        System.out.println("Mangio animali selvatici");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }
}
