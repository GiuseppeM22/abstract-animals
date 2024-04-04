package org.model;

public abstract class Animale {

    //ATTRIBUTI
    private String nome;
    private String genere;

    //COSTRUTTORI
    public Animale(String nome, String genere) {
        this.nome = nome;
        if(genere == null || genere.isEmpty()){
            throw new RuntimeException("Il genere deve essere definito");
        }
        this.genere = genere;
    }

    //METODI
    public void dormi(){
        System.out.println("Zzzzzz");
    };
    abstract void verso();
    abstract void mangia();
}
