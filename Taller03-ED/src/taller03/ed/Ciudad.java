package taller03.ed;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ciudad implements Comparable<Ciudad>{

    private String nombre;

    private int poblacion;
    private float area;
    private PriorityQueue<PuntoTuristico> listaPuntosTuristicos;

    public Ciudad(String nombre, int poblacion, float area) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.area = area;
        listaPuntosTuristicos = new PriorityQueue<PuntoTuristico>();
        
    }

    public PriorityQueue<PuntoTuristico> getListaPuntos() {
        return listaPuntosTuristicos;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Ciudad o) {
        String nombre1= this.nombre.toUpperCase();
        String nombre2= o.nombre.toUpperCase();
        if(nombre1.equals(nombre2)){
            return 0;
        }
        else{
            int contador=0, respuesta=0;
            int limite = nombre1.length()>nombre2.length()?nombre2.length():nombre1.length();
            do{
                if(nombre1.charAt(contador)>nombre2.charAt(contador)){
                    respuesta = 1;
                }
                else{
                    respuesta = -1;
                }
                contador++;
            }while(contador<limite && respuesta == 0);
            return respuesta;
        }
        
    }

    
    
    
    
}
