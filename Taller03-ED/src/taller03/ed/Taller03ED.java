/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller03.ed;

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
        System.out.println("holamundo");
        
    }
    
    public static void menu(Pais pais){
        int contador = 1;
        
        for(Ciudad ciu : pais.getListaCiudades()){
            System.out.println(contador+") "+ciu);
            contador++;
        }
        System.out.println(contador+") Salir");
        
    }
}