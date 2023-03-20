package com.elie.tp_lampe;

public class Main {
    public static void main(String[] args) {
        Lampe lampe = new Lampe(false);
        Interrupteur interrupteur = new Interrupteur(lampe);

        System.out.println(lampe.estAllumee());
        System.out.println(interrupteur.getPosition());

        interrupteur.changerPosition();

        System.out.println(lampe.estAllumee());
        System.out.println(interrupteur.getPosition());

        interrupteur.changerPosition();

        System.out.println(lampe.estAllumee());
        System.out.println(interrupteur.getPosition());

        interrupteur.changerPosition();

        System.out.println(lampe.estAllumee());
        System.out.println(interrupteur.getPosition());
    }
}