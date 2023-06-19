public class NodoDoble {
    private Pokemon pokemon;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    /**
     * Constructor del Nodo Doble
     * @param pokemon
     */

    public NodoDoble(Pokemon pokemon){
        this.pokemon = pokemon;
    }

    /**
     * Get's y Set's de Nodo Doble
     * @return
     */

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}
