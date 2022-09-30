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
        while (temp != null) {
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
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
        Nodo nvoNodo = new Nodo(valor);
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
            if (p == 0) {
                nvoNodo.setSiguiente(inicio);
                inicio = nvoNodo;
            } else {
                Nodo temp = new Nodo();
                int c = 0;
                while(c < (p - 1)){
                    temp = temp.getSiguiente();
                    c++;
                }
                System.out.println(temp.getValor() + " - ");
            }
        }
    }
}
