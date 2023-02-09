package org.example;

import clases.Villain;
import org.example.paquetico.Couple;

public class Headquarters {
    public static void main(String[] args) {

        Heroe heroe = new Heroe();
        heroe.setName("Batman");
        heroe.setPower(50);
        System.out.println(heroe.getName());
        System.out.println(heroe.getPower());

        Villain villain = new Villain();

        Couple couple = new Couple("G x H");


    }
}
