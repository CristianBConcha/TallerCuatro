import edu.princeton.cs.stdlib.In;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

import java.util.Locale;

public class PokedexImpl implements Pokedex{
    /**
     * Constructor de PokedexImpl
     */
    public PokedexImpl() {
        ListaPokemon pokedex = new ListaPokemon(151);
        iniciar();
    }

    /**
     * Implementacio de Metodo insertarAlFinalHead
     */
    @Override
    public void insertarAlFinalHead() {

    }

    /**
     * Implementacion de Metodo insertarAlFinalHead
     */
    @Override
    public void insertarAlFinalTail() {

    }

    /**
     * Implementacion de Metodo recorrerAdelante
     */
    @Override
    public void recorrerAdelante() {

    }

    /**
     * Implementacion de Metodo iniciar
     */
    @Override
    public void iniciar() {
        leerArchivo();
        this.menu();
    }

    /**
     * Metodo que despliega el menu
     */
    void leerArchivo(){
    // Nombre del archivo a leer
    String archivo = "Kanto.txt";

    // Definicion del archivo de entrada
    In entrada = new In(archivo);

    // Mientras existan lineas por leer
    while (entrada.hasNextLine()) {
        // Leer la linea completa
        String linea = entrada.readLine();
        System.out.println(linea);
    }
    }
    @Override
    public void menu() {

                String opcion;
                StdOut.println("""
                        Ϟ(๑⚈ ․̫ ⚈๑)⋆ Bienvenido a la pokedex  Ϟ(๑⚈ ․̫ ⚈๑)⋆
                              
                        [1] "requerimineto 1 "
                        [2] "requerimineto 2 "
                        [3]  Buscar por tipo
                        [4]  Desplegar pokemons de primera evolucion
                        [5] "requerimineto 5 "
                        [6] "requerimineto 6 "
                        [7] Salir del programa
                        """);
                StdOut.print("Escoja una opcion: ");
                opcion = StdIn.readLine();

                switch (opcion) {
                    case "1" -> creciente();
                    case "2" -> requerimientoDos();
                    case "3" -> tipo();
                    case "4" -> primeraEvolucion();
                    case "5" -> requerimientoCinco();
                    case "6" -> requerimientoSeis();
                    case "7" -> System.exit(0);
                    default -> System.out.println("El numero ingresado no corresponde a una opcion");

                }
            }




    @Override
    public void creciente(){
        System.out.println("requerimineto 1");
        ListaNodoDoble listaCreciente = new ListaNodoDoble();
        // Nombre del archivo a leer
        String archivo = "Kanto.txt";

        // Definicion del archivo de entrada
        In entrada = new In(archivo);

        // Mientras existan lineas por leer
        while (entrada.hasNextLine()) {
            // Leer la linea completa
            String linea = entrada.readLine();
            //Se separa cada parte de la linea por ,
            String[] partes = linea.split(",");

        }
        System.out.println("¿Desea realizar otra operación?[si/no]");
        String respuesta;
        respuesta = StdIn.readLine().toLowerCase(Locale.ROOT);
        if (respuesta.equals("si")) {
            menu();
        }
        else {
            System.exit(0);
        }
    }

    /**
     * Metodo que muestra los pokemons de un tipo especifico
     */
    public void tipo() {
        System.out.println("Ingrese el tipo a buscar");
        String tipoBuscar;
        tipoBuscar = StdIn.readLine();
        System.out.println("Se muestran resultados de la búsqueda:");

        // Nombre del archivo a leer
        String archivo = "Kanto.txt";

        // Definicion del archivo de entrada
        In entrada = new In(archivo);

        // Mientras existan lineas por leer
        while (entrada.hasNextLine()) {
            // Leer la linea completa
            String linea = entrada.readLine();
            //Se separa cada parte de la linea por ,
            String[] partes = linea.split(",");
            int ultimo = partes.length - 1;
            int penuntimo = partes.length - 2;
            if (partes[ultimo].equals(tipoBuscar) || partes[penuntimo].equals(tipoBuscar)) {
                System.out.println(linea);
            }
        }
        System.out.println("¿Desea realizar otra operación?[si/no]");
        String respuesta;
        respuesta = StdIn.readLine().toLowerCase(Locale.ROOT);
        if (respuesta.equals("si")) {
            menu();
        }
        else {
            System.exit(0);
        }
    }
    /**
     * Metodo que todos los pokémon de primera evolución, ordenados según su id en orden decreciente.
     */
    public void primeraEvolucion(){
        System.out.println("Se muestran todos los pokemons de primera evolucion:");

        // Nombre del archivo a leer
        String archivo = "Kanto.txt";

        // Definicion del archivo de entrada
        In entrada = new In(archivo);

        // Mientras existan lineas por leer
        while (entrada.hasNextLine()) {
            // Leer la linea completa
            String linea = entrada.readLine();
            //Se separa cada parte de la linea por ,
            String[] partes = linea.split(",");
            if (partes[2].equals("Primera Evolucion")) {
                System.out.println(linea);
            }
        }
        System.out.println("¿Desea realizar otra operación?[si/no]");
        String respuesta;
        respuesta = StdIn.readLine().toLowerCase(Locale.ROOT);
        if (respuesta.equals("si")) {
            menu();
        }
        else {
            System.exit(0);
        }
    }
    public void requerimientoDos(){
        System.out.println("requerimineto 2");
        iniciar();
    }
    public void requerimientoCinco(){
        System.out.println("requerimineto 5");
        iniciar();
    }
    public void requerimientoSeis(){
        System.out.println("requerimineto 6");
        iniciar();
    }
}