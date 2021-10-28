
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Pastel extends Postre{

    
    public Pastel(String sabor, double precioParcial, ArrayList<Aderezo> aderezos){
    	super(sabor, precioParcial, aderezos);    
        precioParcial = 15.55;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;      
        precioFinal=(super.getPrecioParcial()+(super.getPrecioParcial()*0.12))+(super.getAderezos().size()*0.50);
        return precioFinal;
    }


    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + super.getSabor() + ", precioParcial=" + super.getPrecioParcial() + ", aderezos=" + super.getAderezos() + '}';
    }
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
}
