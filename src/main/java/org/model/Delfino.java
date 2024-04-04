package org.model;

public class Delfino extends Animale implements Nuoto{

    public Delfino(String nome, String genere) {
        super(nome, genere);
    }

    @Override
    void verso() {
        System.out.println("iiiiii");
    }

    @Override
    void mangia() {
        System.out.println("Mangio altri pesci");
    }

    @Override
    public void nuoto() {
        System.out.println("Sto nuotando!");
    }
}
