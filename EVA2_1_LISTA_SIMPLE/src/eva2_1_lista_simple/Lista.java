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
    private Nodo fin;
// por default la lista esta vacia

    public Lista() {
        this.inicio = null; // no hay nodos en la lista
        this.fin = null;
    }

    public void imprimir() {
        Nodo temp = inicio;
// como muevo a temp?
        if (inicio == null) {
            System.err.println("Lista vacia");
        } else {
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
        }
        System.out.println("");
    }

    // agregar un nodo al final de la lista
    // solucion 1: O(n^2)
    public void add(int valor) {
        Nodo nvoNodo = new Nodo(valor);
        // verificar si hay nodos en la lista
        if (inicio == null) { // no hay nodos en la lista
            inicio = nvoNodo;
            fin = nvoNodo;
        } else { // hay nodos en la lista
            // hay que movernos por la lista 
            // usando un nodo temporal hasta el ultimo nodo de la lista
            /*Nodo temp = inicio;
             while (temp.getSiguiente() != null) {
             temp = temp.getSiguiente();
             }
             temp.setSiguiente(nvoNodo);*/
            fin.setSiguiente(nvoNodo);
            fin = nvoNodo;
        }
    }

    public int size() {
        int c = 0;
        Nodo temp = inicio;
        while (temp != null) {
            c++;
            temp = temp.getSiguiente();
        }
        return c;
    }

    public void addIn(int valor, int p) throws Exception {
        int t = size();
        /*que debemos validar?
         insertar en una posicion no valida
         posiciones negativas
         posiciones mayores a la cantidad de elementos
         */
        if (p < 0) {  // si es negativo, lanza un error
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        } else if (p >= t) { //posiciones mayores a la cantidad de elementos
            throw new Exception(p + " no es una posición válida en la lista");
        } else {
            Nodo nvoNodo = new Nodo(valor);
            if (p == 0) {
                nvoNodo.setSiguiente(inicio);
                inicio = nvoNodo;
            } else {
                Nodo temp = inicio;
                int c = 0;
                while (c <= (p - 1)) {
                    temp = temp.getSiguiente();
                    c++;
                }
                nvoNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nvoNodo);
            }
        }
    }

    public void empty() {
        inicio = null;
        fin = null;
    }

    // if we delete the last node, we need to move the end node
    // if the list has only one node its best we call empty list
    // if its the first node we only change the start node
    // if there are no nodes in the list, nothing is deleted
    public void deleteIn(int p) throws Exception {
        int t = size();
        /*que debemos validar?
         borrar en una posicion no valida
         posiciones negativas
         posiciones mayores a la cantidad de elementos
         */
        if (p < 0) {  // si es negativo, lanza un error
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        } else if (p > t) { //posiciones mayores a la cantidad de elementos
            throw new Exception(p + " no es una posición válida en la lista");
        } else {
            // piensen como programadores:
            // que puede salir mal si:
            if (t == 1) {
                empty();
            } else {
                // borrar el primer nodo
                // borrar nodo intermedio
                // borrar el ultimo nodo
                if (p == 0) {
                    inicio = inicio.getSiguiente();
                } else {
                    Nodo temp = inicio;
                    int c = 0;
                    while (c <= (p - 1)) {
                        temp = temp.getSiguiente();
                        c++;
                    }
                    // ya estoy en el nodo previo
                    Nodo next_obj = temp.getSiguiente();
                    temp.setSiguiente(next_obj.getSiguiente());
                    if (p == (t - 1)) {
                        fin = temp;
                    }
                }
            }
        }
    }

    public int getValueAt(int p) throws Exception {
        Nodo temp = inicio;
        int c = 0;
        while (c <= (p - 1)) {
            temp = temp.getSiguiente();
            c++;
        }
    }
}
