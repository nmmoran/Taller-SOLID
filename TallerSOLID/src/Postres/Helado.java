
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;


public class Helado extends Postre{

    
    public Helado(String sabor, double precioParcial, ArrayList<Aderezo> aderezos){
        super(sabor, precioParcial, aderezos);
        aderezos= new ArrayList<>();
        precioParcial = 7.85;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(super.getPrecioParcial()+(super.getPrecioParcial()*0.12))+(super.getAderezos().size()*0.50);
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + super.getSabor() + ", precioParcial=" + super.getPrecioParcial() + ", aderezos=" + super.getAderezos() + '}';
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }

}

