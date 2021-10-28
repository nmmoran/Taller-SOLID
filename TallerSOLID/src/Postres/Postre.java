package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Postre(){
    
    }
    public Postre(String sabor, double precioParcial, ArrayList<Aderezo> aderezos) {
    this.sabor = sabor;
    this.precioParcial = precioParcial;
    this.aderezos = aderezos;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public void setAderezos(ArrayList<Aderezo> aderezos) {
        this.aderezos = aderezos;
    }
    
    public void anadirAderezo(Aderezo aderezo){
        this.getAderezos().add(aderezo);
    }
   
    public void quitarAderezo(Aderezo aderezo){
        this.getAderezos().remove(aderezo);
    }

}