package com.elie.tp_lampe;

public class Lampe {
    private boolean etat;

    public Lampe(boolean etat){
        this.etat = etat;
    }

    public boolean estAllumee() {
        return etat;
    }

    public void modifierEtat() {
        this.etat = !this.etat;
    }
}
