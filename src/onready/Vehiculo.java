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
public abstract class  Vehiculo implements VehiculoDetallado {
    
    private String marca;
    private String modelo;
    private String precio;

    public Vehiculo(String marca, String modelo,String precio) {
        this.marca = marca;
        this.modelo = modelo;
      this.precio=precio;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPrecio() {
        return precio;
    }
    
    
    @Override
    public  void modeloConLetra(char letra){
        String resp;
       if (this.modelo.contains(String.valueOf(letra))){
           System.out.println("Vehiculo que contiene en el modelo la letra \'"+Character.toUpperCase(letra)+"\' : " + this.marca+" "+ this.modelo+" $"+this.precio);
       }
    }
    //Saco los . y , y lo convierto a int.
    @Override
    public int getPrecioEntero(){
        String numPrecio = precio;
        String p =numPrecio.replaceAll("[^0-9]", "");
       int i = Integer.parseInt(p);
       return i;
        
    }
      
    
}
