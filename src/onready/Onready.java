/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;

import java.util.ArrayList;

/**
 *
 * @author Ger
 */
public class Onready {
    /**
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Concesionaria cons = new Concesionaria();
        
        cons.ImprimirVehiculos();
        
         System.out.println("=============================");
         
         cons.elMasCaro();
         cons.elMasBarato();
         cons.tieneLetra('Y');
         
         System.out.println("=============================");
         
         cons.OrdenarVehiculosPorPrecio();
         
        /*Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50
=============================
Vehículo más caro: Peugeot 208
Vehículo más barato: Honda Titan
Vehículo que contiene en el modelo la letra ‘Y’: Yamaha YBR $80.500,50

Ejercicio extra (si lo haces sumas puntos)
=============================
Vehículos ordenados por precio de mayor a menor:
Peugeot 208
Peugeot 206
Yamaha YBR
Honda Titan
*/
    }
    
}
