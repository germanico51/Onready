/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Ger
 */
public class Auto extends Vehiculo{
    
    private int cantPuertas;

    public Auto(String marca, String modelo , int cantPuertas,String precio) {
        super(marca,modelo,precio);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }
    
    
     @Override
    public String toString() {
        StringBuilder str = null;
        str = new StringBuilder();
        str.append("Marca: " + getMarca() +" // " + " Modelo: " + getModelo()+ " // " + " Puertas: "+getCantPuertas() +" // "+"Precio: $" +getPrecio());
        return str.toString();
    }
}
// Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
