/*
 ADD A NODE

 */
package eva2_1_lista_simple;

/**
 *
 * @author moviles
 */
public class Lista {

    private Nodo inicio;
// poe default la lista esta vacia

    public Lista() {
        this.inicio = null; // no hay nodos en la lista
    }

    public void imprimir() {
        Nodo temp = inicio;
// como muevo a temp?
        while (temp.getSiguiente() != null) {
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
    }

    // agregar un nodo al final de la lista
    public void add(int valor) {
        Nodo nvoNodo = new Nodo(valor);
        // verificar si hay nodos en la lista
        if (inicio == null) { // no hay nodos en la lista
            inicio = new Nodo();
        } else { // hay nodos en la lista
            // hay que movernos por la lista 
            // usando un nodo temporal hasta el ultimo nodo de la lista
            Nodo temp = inicio;
            while (temp.getSiguiente()!= null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nvoNodo);
        }
    }
}
