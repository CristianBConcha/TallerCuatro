public interface Pokedex {
    /**
     * Metodo insertarAlFinalHead
     */
    void insertarAlFinalHead();

    /**
     * Metodo insertarAlFinalHead
     */
    void insertarAlFinalTail();

    /**
     * Metodo recorrerAdelante
     */
    void recorrerAdelante();



    /**
     * Metodo iniciar
     */
    void iniciar();
    /**
     * Metodo que despliega el menu
     */
    void menu();
    /**
     * Metodo que crea una lista con los pokemons y los ordena en orden creciente de su ID
     */
    void creciente();
    /**
     * Metodo que muestra los pokemons de un tipo especifico
     */
    void tipo();
    /**
     * Metodo que todos los pokémon de primera evolución, ordenados según su id en orden decreciente.
     */
    void primeraEvolucion();
}
