/*
to insert at the beginning of the list -> inicio = nvoNodo.next()
 */
package eva2_1_lista_simple;

/**
 *
 * @author moviles
 */
public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista = new Lista();
        miLista.add(10);
        miLista.add(20);
        miLista.add(30);
        miLista.add(40);
        miLista.add(50);
        miLista.add(60);
        //miLista.imprimir();
        //int [] arreglo = new int[1000000];
        for (int i = 0; i < 1000000; i++) { // O(n^2) usando while en add
            miLista.add(1000);
        }
        System.out.println("Conteo de nodos: " + miLista.size());
    }
    
}
