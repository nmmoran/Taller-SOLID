
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Pastel extends Postre{

    
    public Pastel(String sabor, double precioParcial, ArrayList<Aderezo> aderezos){
    	super(sabor, precioParcial, aderezos);    
        precioParcial = 15.55;
    }
    

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + super.getSabor() + ", precioParcial=" + super.getPrecioParcial() + ", aderezos=" + super.getAderezos() + '}';
    }
   
    
}
