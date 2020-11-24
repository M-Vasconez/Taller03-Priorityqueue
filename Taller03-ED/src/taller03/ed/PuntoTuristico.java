
package taller03.ed;

import java.util.Comparator;

public class PuntoTuristico implements Comparator {
    String nombre;
    double latitud, longitud, puntuacion;

    public PuntoTuristico(String nombre, double latitud, double longitud, double puntuacion) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getPuntuacion() {
        return puntuacion;
    }
    
    

    @Override
    public int compare(Object o1, Object o2) {
        PuntoTuristico punto1=(PuntoTuristico) o1;
        PuntoTuristico punto2=(PuntoTuristico) o2;
        if(punto1.puntuacion > punto2.puntuacion){
            return 1;
        }else if(punto1.puntuacion == punto2.puntuacion){
            return 0;
        }else{
            return -1;
        }
    }
       
    
}
