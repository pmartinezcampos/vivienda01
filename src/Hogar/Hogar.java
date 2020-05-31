/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author lucasjosemoraleschacon
 */
public class Hogar 
{

    
    public static void main(String[] args) 
    {
        Vivienda casa1 = new Vivienda(120000);
        
        double precio = 60000.0;
        int numHabitaciones = 3;
        double superficie = 200.0;
        boolean parking = true;
        String estado = "Bueno";
        String propietario = "Pedro";
        
         Vivienda casa2 = new Vivienda(precio, numHabitaciones, superficie, parking, estado, propietario) ;
         
        imprimirVivienda(casa1);
        imprimirVivienda(casa1);
        
        imprimirVivienda(casa2);
        
        
        
        
        
    }
    public static void imprimirVivienda(Vivienda casa1){
        
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa1.isParking());
        System.out.println("Estado: "+ casa1.getEstado());
        System.out.println("Propietario: "+ casa1.getPropietario());
        
        
        
    }
    
}
