/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_stack;

/**
 *
 * @author moviles
 */
public class MyStack {

    private Nodo inicio;
    private Nodo fin;
    private int c;

    public MyStack() {
        this.inicio = null; // no hay nodos en la lista
        this.fin = null;
        this.c = 0;
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
            nvoNodo.setPrevio(fin);
            fin = nvoNodo;
        }
        c++;
    }

    public int size() {
        /*int c = 0;
         Nodo temp = inicio;
         while (temp != null) {
         c++;
         temp = temp.getSiguiente();
         }*/
        return this.c;
    }

    public void push(int valor){
        add(valor);
    }
    
    public Integer peek() {
        // verificar si la lista esta vacia
        // si no esta vacia, regresa el valor
        if (empty()) {
            return null;
        } else {
            return fin.getValor();
        }
    }
    
    public Integer pop() throws Exception {
        if (empty()) {
            return null;
        } else {
            int v = fin.getValor();
            //borra el nodo en la cima de la pila
            deleteIn(size() - 1);
            return v;
        }
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
                inicio.setPrevio(nvoNodo);
                inicio = nvoNodo;
            } else {
                Nodo temp = inicio;
                int c = 0;
                while (c < p) {
                    temp = temp.getSiguiente();
                    c++;
                }
                nvoNodo.setSiguiente(temp);
                nvoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nvoNodo);
                temp.setPrevio(nvoNodo);
            }
        }
        this.c++;
    }

    public boolean empty() {
        if (inicio == null) {
            return true;
        }else{
            return false;
        }
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
                    while (c <= p) {
                        temp = temp.getPrevio();
                        c++;
                    }
                    Nodo next_obj = temp.getSiguiente();
                    Nodo prev_obj = temp.getPrevio();
                    prev_obj.setSiguiente(prev_obj);
                    if (p == (t - 1)) {
                        fin = prev_obj;
                    }else{
                        next_obj.setPrevio(prev_obj);
                    }
                }
                this.c--;
            }
        }
    }

    public int getValueAt(int p, int valor) throws Exception {
        int t = size();
        if (p < 0) {  // si es negativo, lanza un error
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        } else if (p > t) { //posiciones mayores a la cantidad de elementos
            throw new Exception(p + " no es una posición válida en la lista");
        } else {
            Nodo temp = inicio;
            int c = 0;
            while (c < p) {
                temp = temp.getSiguiente();
                c++;
            }
            // ya estoy en el nodo previo
            valor = temp.getValor();
        }
        return valor;
    }
}
