import edu.princeton.cs.stdlib.StdOut;

public class ListaNodoDoble {
    private NodoDoble head;
    private NodoDoble tail;

    public ListaNodoDoble() {
        this.head = null;
        this.tail = null;
    }

    public void insertarAlFinalHead(Pokemon pokemon){
        NodoDoble nuevoNodo = new NodoDoble(pokemon);
        if (this.head == null){
            this.head = nuevoNodo;
            return;
        }
        NodoDoble aux = this.head;
        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(aux);
    }
    public void instertarAlFinalTail(Pokemon pokemon){
        NodoDoble nuevoNodo = new NodoDoble(pokemon);
        if(this.tail == null){
            this.head = nuevoNodo;
            this.tail = nuevoNodo;
        }
        this.tail.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(this.tail);
        this.tail = nuevoNodo;
    }
    public void recorrerAdelante(){
        NodoDoble aux = this.head;
        while (aux != null){
            StdOut.println(aux.getPokemon());
            aux = aux.getSiguiente();
        }
        return;
    }
    public void insertarComienzo(Pokemon pokemon){
        NodoDoble nuevoNodo = new NodoDoble(pokemon);
        if(this.head == null){
            this.head = nuevoNodo;
            this.tail = nuevoNodo;
        }
        nuevoNodo.setSiguiente(this.head);
        this.head.setAnterior(nuevoNodo);
        this.head = nuevoNodo;
    }
}