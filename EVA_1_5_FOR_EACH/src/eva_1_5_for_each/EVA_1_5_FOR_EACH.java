/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_5_for_each;

/**
 *
 * @author moviles
 */
public class EVA_1_5_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[50];
        for (int i = 0; i < arregloDatos.length; i++) { // la i viene de index
            arregloDatos[i] = (int)(Math.random() * 100); // random genera doubles entre 0 y 1, se multiplica por 100 y se castea como entero
        }
        // for each (para cada), recorre el arreglo de 1 por 1 y lo asigna a arregloDato
        for (int arregloDato : arregloDatos) { 
            System.out.print("[" + arregloDato + "]");
        }
    }
    
}
