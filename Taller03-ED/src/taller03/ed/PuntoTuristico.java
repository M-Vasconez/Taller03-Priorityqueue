
package taller03.ed;


public class PuntoTuristico implements Comparable<PuntoTuristico> {
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
    public int compareTo(PuntoTuristico o) {
        if(this.puntuacion < o.puntuacion){
            return 1;
        }else if(this.puntuacion == o.puntuacion){
            if(this.longitud>o.longitud){ 
                return 1;
            }
            else if (this.longitud == o.longitud){
                if(this.latitud<o.latitud){
                    return 1;
                }
                else if (this.latitud == o.latitud){
                    return 0;
                }
                else{
                    return -1;
                }
            }
            else{
                return -1;
            }
            
        }else{
            return -1;
        }
    }    

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
