/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

/**
 *
 * @author Luis Pedrosa Ruiz
 */
public class Empleado {
    String nombre;
    int hsemanales;
    int categoria;

    public Empleado(String nombre, int hsemanales, int categoria) {
        this.nombre = nombre;
        this.hsemanales = hsemanales;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHsemanales() {
        return hsemanales;
    }

    public int getCategoria() {
        return categoria;
    }
    
}
