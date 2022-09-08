/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_16_ejercicio_arreglos_5;

/**
 *
 * @author moviles
 */
public class EVA_1_16_EJERCICIO_ARREGLOS_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int[] aleatorios = new int[50];
        int c_pares = 0;
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = ((int) (Math.random() * 100)) + 1;
            if (aleatorios[i] % 2 == 0) {
                c_pares++;
            }
        }
        imprimir(aleatorios);
        System.out.println("\nPARES");
        int[] pares = new int[c_pares];
        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i] % 2 == 0) {
                pares[i] = aleatorios[i];
            }
        }
        imprimir(pares);
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }

    }
}
