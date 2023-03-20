package com.elie.tp_lampe;

public class Interrupteur {
    private boolean position;
    private Lampe lampe;

    public Interrupteur(Lampe lampe){
        this.lampe = lampe;
        this.position = lampe.estAllumee();
    }

    public String getPosition(){
        if (position == true){
            return "On";
        }else {
            return "Off";
        }
    }
    public void changerPosition(){
        lampe.modifierEtat();
        position = lampe.estAllumee();
    }
}
