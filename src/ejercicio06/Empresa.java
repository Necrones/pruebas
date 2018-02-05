package ejercicio06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import utilidadesnumeros.Numeros;

/**
 *
 * @author Luis Pedrosa Ruiz
 */
public class Empresa {

    Descuento[] descuentos;
    Categoria[] categorias;
    Empleado[] empleados;

    public Empresa() {
        inicializar();
        empleados = new Empleado[10];
    }

    private void inicializar() {
        descuentos = new Descuento[]{
            new Descuento(300, 0.05f),
            new Descuento(600, 0.1f),
            new Descuento(Float.MAX_VALUE, 0.015f)
        };
        categorias = new Categoria[]{
            new Categoria("10", 6),
            new Categoria("20", 8),
            new Categoria("30", 10),
            new Categoria("40", 14)
        };
    }

    public Empresa(int nemple) {
        inicializar();
        empleados = new Empleado[nemple];
    }

    public void carga() throws IOException {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String nombre;
        int horas;
        for (int nemple = 0; nemple < empleados.length; nemple++) {
            System.out.println("Introduce el nombre");
            nombre = teclado.readLine();
            horas = Numeros.pedirNumeroEntero("Introduce las horas");
            empleados[nemple] = new Empleado(nombre, horas, 9999);
        }
    }

    /**
     * Metodo para buscar una categoria
     *
     * @param valorBuscar categoria a buscar
     * @return -1 en el caso de que no lo encuentre o el codigo de la categoria
     * es erroneo
     */
    private int buscarCategoria(String valorBuscar) {
        int codigo = 0;
        boolean encontrado = false;
        while (encontrado && codigo < categorias.length) {
            if (valorBuscar.equalsIgnoreCase(categorias[codigo].getNombre())) {
                encontrado = true;
            } else {
                codigo++;
            }
        }
        if (!encontrado) {
            codigo = -1;
        }
        return codigo;
    }
}
