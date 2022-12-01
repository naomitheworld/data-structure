/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_busqueda_binaria;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class EVA3_3_BUSQUEDA_BINARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[15];
        int[] arregloSel = new int[arregloDatos.length];
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        System.out.println("Arreglo original: ");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        System.out.println("Arreglo sort: ");
        copiar(arregloDatos, arregloSel);
        imprimir(arregloSel);
        imprimir(arregloSel);
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el valor a buscar");
        int buscar = s.nextInt();
        System.out.println("");
        System.out.println("El valor esta en: " + busquedaBinaria(arregloSel, buscar));
    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    //imprimir arreglo
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 10) {
                System.out.print("[ " + arreglo[i] + "]");
            } else {
                System.out.print("[" + arreglo[i] + "]");
            }
        }
        System.out.println("");
    }

    //copiar arreglo
    public static void copiar(int[] arreglo, int[] copia) {
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }

    //selection sort 
    //comparaciones
    //intecambios (swap)
    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //busco el elemento (posicion) mas pequeño
            for (int j = i + 1; j < arreglo.length; j++) {
                //buscar el mas pequeño
                if (arreglo[min] > arreglo[j]) {
                    min = j;
                }
                //swap intercambiar
                if (min != i) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[min];
                    arreglo[min] = temp;

                }
            }
        }
    }

    public static int busquedaBinaria(int[] datos, int val) {
        return busquedaBinariaRec(datos, 0, datos.length - 1, val);
    }

    private static int busquedaBinariaRec(int[] datos, int ini, int fin, int val) {
        int mid = ini + ((fin - ini) / 2);
        int res = -1;
        if (ini < fin) {
            if (val == datos[mid]) {
                res = mid;
            } else if (val < datos[mid]) {
                res = busquedaBinariaRec(datos, ini, mid - 1, val);
            }else{
                res = busquedaBinariaRec(datos, mid+1, fin, val);
            }
        }
        return res;
    }
}
