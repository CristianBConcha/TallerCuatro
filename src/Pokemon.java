public class Pokemon {
    private int id;
    private String nombre;
    private String etapa;
    private String evolucionSiguiente;
    private String evolucionPrevia;
    private String tipo1;
    private String tipo2;

    /**
     * Constructor de la clase Pokemon
     * @param id identificador del pokemon
     * @param nombre nombre del pokemon
     * @param etapa etapa del pokemon
     * @param evolucionSiguiente siguiente evolucion del pokemon
     * @param evolucionPrevia anterior evolucion del pokemon
     * @param tipo1 tipo 1 del pokemon
     * @param tipo2 tipo 2 del pokemon
     */
    public Pokemon(int id, String nombre, String etapa, String evolucionSiguiente, String evolucionPrevia, String tipo1, String tipo2) {
        this.id = id;
        this.nombre = nombre;
        this.etapa = etapa;
        this.evolucionSiguiente = evolucionSiguiente;
        this.evolucionPrevia = evolucionPrevia;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    /**
     * Get's and Set's de la clase Pokemon
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getEvolucionSiguiente() {
        return evolucionSiguiente;
    }

    public void setEvolucionSiguiente(String evolucionSiguiente) {
        this.evolucionSiguiente = evolucionSiguiente;
    }

    public String getEvolucionPrevia() {
        return evolucionPrevia;
    }

    public void setEvolucionPrevia(String evolucionPrevia) {
        this.evolucionPrevia = evolucionPrevia;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }
}
