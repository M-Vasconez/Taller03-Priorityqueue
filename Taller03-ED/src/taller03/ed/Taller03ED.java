/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller03.ed;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Matias Vasconez
 */
public class Taller03ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static Ciudad leerArchivos(String archivo){
        Ciudad ciudad = new Ciudad(archivo,1,1);
        try{
            BufferedReader lector = new BufferedReader(new FileReader("src/Archivos/"+archivo+".txt"));
            String linea;
            while((linea=lector.readLine()) != null){
                    String[] lineaSep = linea.split(",");
                    PuntoTuristico pt = new PuntoTuristico(lineaSep[0],Double.parseDouble(lineaSep[1]),Double.parseDouble(lineaSep[2]),Double.parseDouble(lineaSep[3]));
                    ciudad.getListaPuntos().add(pt);
            }
            
            lector.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println("Archivo no encontrado: "+ex);
        }
        catch (IOException ex) {
            System.err.println("Archivo no encontrado: "+ex);
        }
        
        return ciudad;
    }
    
    
}
