/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_lista_doble;

import com.sun.istack.internal.logging.Logger;

/**
 *
 * @author moviles
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.add(10);
        listaDoble.add(20);
        listaDoble.add(30);
        listaDoble.add(40);
        listaDoble.imprimir();
        try{
        listaDoble.addIn(25, 2);
        }catch(Exception e){
            Logger.getLogger(null, null);
        }
        listaDoble.imprimir();
    }
    
}
