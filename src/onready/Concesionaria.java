/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Ger
 */
public class Concesionaria {

    public List<Vehiculo> listaVehiculos;

    public Concesionaria() {
        Auto auto01 = new Auto("Peugeot", "206", 4, "200.000,00");
        Moto moto01 = new Moto("Honda", "Titan", 125, "60.000,00");
        Auto auto02 = new Auto("Peugeot", "208", 5, "250.000,00");
        Moto moto02 = new Moto("Yamaha", "YBR", 160, "80.500,50");

        Vehiculo[] vehiculos = {auto01, moto01, auto02, moto02};
        listaVehiculos = Arrays.asList(vehiculos);

    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
    Comparator<Vehiculo> comparator = Comparator.comparing(Vehiculo::getPrecioEntero);

    public void tieneLetra(char letra) {
        listaVehiculos.stream().forEach((v) -> v.modeloConLetra(letra));
    }

    public void elMasCaro() {
        Vehiculo vehic = listaVehiculos.stream().max(comparator).get();
        System.out.println("Vehículo más caro: " + vehic.getMarca() + " " + vehic.getModelo());
    }

    public void elMasBarato() {
        Vehiculo vehic = listaVehiculos.stream().min(comparator).get();
        System.out.println("Vehículo más barato: " + vehic.getMarca() + " " + vehic.getModelo());
    }

    public void OrdenarVehiculosPorPrecio() {
        List<Vehiculo> myList;
        
        myList = listaVehiculos.stream().sorted(comparator.reversed()).collect(Collectors.toList());
       
       for(Vehiculo v : myList){
           System.out.print(v.getMarca()+" ");
           System.out.println(v.getModelo());
       }
                         
    }

    public void ImprimirVehiculos() {
        listaVehiculos.stream().forEach(System.out::println);
    }
}
