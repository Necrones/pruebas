package ejercicio06;

/**
 *
 * @author Luis Pedrosa Ruiz
 */

public class Categoria {
    String nombre;
    float pHora;

    public Categoria(String nombre, float pHora) {
        this.nombre = nombre;
        this.pHora = pHora;
    }

    public String getNombre() {
        return nombre;
    }

    public float getpHora() {
        return pHora;
    }
    
}
