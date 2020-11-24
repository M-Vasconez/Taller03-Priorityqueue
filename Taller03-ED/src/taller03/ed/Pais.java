/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller03.ed;

import java.util.PriorityQueue;

/**
 *
 * @author Jorge
 */
public class Pais {
    private String nombre;
    private int poblacion;
    private float area;
    private String idioma;
    private PriorityQueue<Ciudad> listaCiudades;

    public Pais(String nombre, int poblacion, float area, String idioma) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.area = area;
        this.idioma = idioma;
        listaCiudades = new PriorityQueue<Ciudad>();
    }

    public PriorityQueue<Ciudad> getListaCiudades() {
        return listaCiudades;
    }
    
    
    
}
