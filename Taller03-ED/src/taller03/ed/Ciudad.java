package taller03.ed;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ciudad implements Comparator{

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
        return "Ciudad{" + "nombre=" + nombre + '}';
    }
    
    

    @Override
    public int compare(Object o1, Object o2) {
        Ciudad ciudad1 = (Ciudad) o1;
        Ciudad ciudad2 = (Ciudad) o2;
        
        String nombre1= ciudad1.nombre.toUpperCase();
        String nombre2= ciudad2.nombre.toUpperCase();
        
        if(nombre1.equals(nombre2)){
            return 0;
        }
        else{
            int contador=0, respuesta=0;
            
            do{
                if(nombre1.charAt(contador)>nombre2.charAt(contador)){
                    respuesta = 1;
                }
                else{
                    respuesta = -1;
                }
                contador++;
            }while((contador!=nombre1.length() || contador!=nombre2.length()) && respuesta != 0);
            return respuesta;
        }
    }
    
    
}
