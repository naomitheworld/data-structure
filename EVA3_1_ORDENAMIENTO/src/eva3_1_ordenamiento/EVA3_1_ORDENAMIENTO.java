/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_ordenamiento;

/**
 *
 * @author moviles
 */
public class EVA3_1_ORDENAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[15];
        int[] arregloSel = new int[arregloDatos.length];
        int[] arregloIns = new int[arregloDatos.length];
        System.out.println("Arreglo original: ");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        System.out.println("Arreglo sort: ");
        copiar(arregloDatos, arregloSel);
        imprimir(arregloSel);
        
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("selection sort "+(fin-ini));
        
        System.out.println("insertion sort");
        copiar(arregloDatos, arregloIns);
        imprimir(arregloIns);
        ini = System.nanoTime();
        insertionSort(arregloIns);
        fin = System.nanoTime();
        imprimir(arregloIns);
        System.out.println("insertion sort " + (fin - ini));
    }
    
    //llenar arreglo
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }
    //imprimir arreglo
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
        if(arreglo[i]<10){
            System.out.print("[ "+arreglo[i]+"]");
        }else{
            System.out.print("["+arreglo[i]+"]");
        }            
    }
        System.out.println("");
    }
    //copiar arreglo
    public static void copiar(int[] arreglo, int[] copia){
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }
    
    //selection sort 
    //comparaciones
    //intecambios (swap)
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min =  i;
            //busco el elemento (posicion) mas pequeño
            for (int j = i+1; j < arreglo.length; j++) {
                //buscar el mas pequeño
                if(arreglo[min] > arreglo[j]){
                    min = j;
                }
                //swap intercambiar
                if(min != i){
                    int temp=arreglo[i];
                    arreglo[i] = arreglo[min];
                    arreglo[min] = temp;
                    
                }
            }
        }
    }
    
    // insertion sort
    public static void insertionSort(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++){
            int temp = arreglo[i]; // es lo que vamos a ordenar
            int insP = i;
            // buscamos en que punto debe quedar temp
            // esa posicion queda almacenada en insP
            for (int previo = i-1; previo >= 0; previo--) {//comparamos
                if (arreglo[previo] > temp) {
                    // swap (intercambio parcial}
                    arreglo[insP] = arreglo[previo];
                    insP--;
                }else{
                    break;
                }
            }
            arreglo[insP] = temp;
        }
    }
}
