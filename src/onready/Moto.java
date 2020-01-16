/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;
/**
 *
 * @author Ger
 */
public class Moto extends Vehiculo{
    
    int cilindrada ;

    public Moto(String modelo, String marca,int cilindrada, String precio) {
        super(modelo,marca,precio);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada(){
        return cilindrada;
    }
    
     @Override
    public String toString() {
        StringBuilder str = null;
        str = new StringBuilder();
        str.append("Marca: " + getMarca() +" // " + " Modelo: " + getModelo()+ " // " + " Cilindrada: "+getCilindrada()+"c" +" // "+"Precio: $" +getPrecio());
        return str.toString();
    }
   
        
}
