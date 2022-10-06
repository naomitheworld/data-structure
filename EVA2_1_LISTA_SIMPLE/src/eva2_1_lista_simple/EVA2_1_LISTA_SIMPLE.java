/*
to insert at the beginning of the list -> inicio = nvoNodo.next()
 */
package eva2_1_lista_simple;

import com.sun.istack.internal.logging.Logger;

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
        miLista.add(10); // 0
        miLista.add(20); // 1
        miLista.add(30); // 2
        miLista.add(40); // 3
        miLista.add(50); // 4
        miLista.add(60); // 5
        
        //miLista.imprimir();
        try{
            miLista.addIn(40, 3);
        }catch(Exception e){
            e.printStackTrace();
        }
        miLista.imprimir();
        miLista.empty();
        miLista.imprimir();
        
        try{
            miLista.deleteIn(0);
        }catch(Exception e){
            Logger.getLogger(null, null);
        }
        //int [] arreglo = new int[1000000];
        /*for (int i = 0; i < 1000000; i++) { // O(n^2) usando while en add
            miLista.add(1000);
        }
        System.out.println("Conteo de nodos: " + miLista.size());*/
    }
    
}
