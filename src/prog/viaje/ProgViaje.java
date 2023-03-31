/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.viaje;

import entidades.Auto;
import entidades.Camion;
import entidades.Camioneta;
import entidades.Ciudad;
import entidades.Vehiculo;
import entidades.Viaje;
import java.text.DecimalFormat;

/**
 *
 * @author juany
 */
public class ProgViaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         DecimalFormat f= new DecimalFormat("#,###.00");
        Vehiculo auto = new Auto("toyota", "tdc518", "nafta");
        Vehiculo camioneta1 = new Camioneta("toyota", "tdc518", "diesel");
        Vehiculo camion = new Camion("toyota", "tdc518", "nafta");
        Vehiculo auto2 = new Auto("toyota", "tdc518", "gnc");
        
        Ciudad c1= new Ciudad(148, 100, "ciudad 1");
        Ciudad c2= new Ciudad(148, 250, "ciudad 2");
        Ciudad c3= new Ciudad(20, 30, "ciudad 3");
        
        Viaje v1 = new Viaje(c2, c1, 300, auto2, 2);
        
        System.out.println("Se realizara un viaje desde "
                + v1.getOrigen().getNombre()+" hasta "+v1.getDestino().getNombre()+ " en "+v1.getV().getClass().getSimpleName());
        System.out.println("La distancia Recorrida es : "+v1.getDistancia());
        if(v1.getOrigen().getRuta()==v1.getDestino().getRuta()){
            System.out.println("Las ciudades estan en la misma ruta, quizas se hizo una correccion en la distancia");
        }else{
            System.out.println("Las ciudades no estan en la misma ruta, tomamos la distancia que ingresò");
        }
        System.out.println("El gasto en combustible fue de : " + f.format(v1.calculoCostoComb()));
        System.out.println("El gasto en peajes fue de : "+v1.calculoCostoPeajes());
        System.out.println("El gasto total: "+f.format(v1.calcularCosto()));
        
    }
    
}