package taller03.ed;

import java.util.PriorityQueue;

public class Ciudad {

    private String nombre;

    private int poblacion;
    private float area;
    private PriorityQueue<PuntoTuristico> listaPuntosTuristicos;

    public Ciudad(String nombre, int poblacion, float area) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.area = area;
    }

    public PriorityQueue<PuntoTuristico> getListaPuntos() {
        return listaPuntosTuristicos;
    }

    
    
}
