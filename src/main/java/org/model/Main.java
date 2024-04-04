package org.model;

public class Main {
    public static void main(String[] args) {
        Delfino delfinoCurioso = new Delfino("Ulisse", "Mammifero");
        faiNuotare(delfinoCurioso);

        Passerotto passerotto = new Passerotto("Alessandro", "Uccelli");
        faiVolare(passerotto);

        Aquila aquila = new Aquila("Aqui", "Uccelli");
        faiVolare(aquila);
    }

    public static void faiVolare(Volo animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuoto animale) {
        animale.nuoto();
    }
}
