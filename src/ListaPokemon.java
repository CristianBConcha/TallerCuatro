public class ListaPokemon {
    private Pokemon[] pokedex;
    private int cantActual;
    private int cantMax;

    /**
     * Constructor de ListaPokemon
     * @param tamanio
     */
    public ListaPokemon(int tamanio) {
        cantActual = 0;
        cantMax = tamanio;
        pokedex = new Pokemon[tamanio];
    }

    /**
     * Metodo agregarPokemon de ListaPokemon
     * @param pokemon
     */
    public void agregarPokemon(Pokemon pokemon){
        if(cantActual == cantMax){
            return;
        }
        pokedex[cantActual] = pokemon;
        cantActual++;
    }
}
