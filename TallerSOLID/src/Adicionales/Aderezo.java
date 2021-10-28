/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author nicol
 */
public abstract class Aderezo {
   // MALVAVISCOS,FRUTILLA,CREMA
    private String nombre;
   public Aderezo(){
       
   }
    public Aderezo(String nombre){
       this.nombre=nombre;
   }
    public abstract void setNombre(String nombre);

    @Override
    public String toString() {
        return ""+nombre.toUpperCase();
    }
    
    
    
}
