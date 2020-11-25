/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller03.ed;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Matias Vasconez
 */
public class Taller03ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreCiudades[]= {"Guayaquil","Quito"};
        Pais pais = new Pais("Ecuador",1,1,"Espanol");
        for(String ciu : nombreCiudades){
            pais.getListaCiudades().add(Lectura.leerArchivos(ciu));
        }
        menu(pais);
        
    }
    
    public static void menu(Pais pais){
        Scanner s = new Scanner(System.in);
        int contador = 1;
        
        for(Ciudad ciu : pais.getListaCiudades()){
            System.out.println(contador+") "+ciu);
            contador++;
        }
        System.out.println(contador+") Salir");
        
        System.out.print("\nIngrese opcion: ");
        int ingreso=Integer.parseInt(s.nextLine());
        Ciudad ciudad = null;
        Iterator<Ciudad> iteradorC = pais.getListaCiudades().iterator();
        
        for(int i=0; i<ingreso;i++){
            ciudad=iteradorC.next();
        }
       
        System.out.print("\nIngrese cantidad de puntos turisticos que desea ver: ");
        int cantidadPuntos=Integer.parseInt(s.nextLine());
        
        Iterator<PuntoTuristico> iteradorP = ciudad.getListaPuntos().iterator();
        for(int i=0; i<cantidadPuntos;i++){
            
            System.out.println(iteradorP.next());
            
        }
        
       
    }
}