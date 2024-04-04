package org.model;

public class Main {
    public static void main(String[] args) {
        //uso dei metodi dormi(), verso(), mangia()
        //ANIMALE CANE
        System.out.println("Il cane: ");
        Animale cane = new Cane("Fuffi", "Mammifero");
        cane.dormi();
        cane.mangia();
        cane.verso();
        System.out.println();

        //ANIMALE PASSEROTTO
        System.out.println("Il Passerotto: ");
        Animale passerottoDiMontagna = new Passerotto("Freddy", "Uccelli");
        passerottoDiMontagna.dormi();
        passerottoDiMontagna.mangia();
        passerottoDiMontagna.verso();
        System.out.println();

        //ANIMALE DELFINO
        System.out.println("Delfino: ");
        Animale delfino = new Delfino("Cicco", "Mammifero");
        delfino.dormi();
        delfino.mangia();
        delfino.verso();
        System.out.println();

        //uso i metodi faiVolare(), faiNuotare()
        System.out.println("Delfino: ");
        Delfino delfinoCurioso = new Delfino("Ulisse", "Mammifero");
        faiNuotare(delfinoCurioso);
        System.out.println();

        System.out.println("Passerotto:");
        Passerotto passerotto = new Passerotto("Alessandro", "Uccelli");
        faiVolare(passerotto);
        System.out.println();

        System.out.println("Aquila:");
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
