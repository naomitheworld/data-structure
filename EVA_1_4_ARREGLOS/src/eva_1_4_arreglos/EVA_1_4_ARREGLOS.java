/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_4_arreglos;

/**
 *
 * @author moviles
 */
public class EVA_1_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tipo de dato [] identificador = new tipo de dato [tamaño]
        // arreglo de enteros para capturar edades:
        // todos los identificadores declarados son arreglos de enteros
        int[] arregloEdades, arregloSalario, arregloCali;
        // solo arregloPromedio es arreglo
        double arregloPromedio[], porcentaje;
        // los arreglos son objetos
        arregloEdades = new int[50];
        System.out.println(arregloEdades);
        for (int i = 0; i < arregloEdades.length; i++) { // la i viene de index
            arregloEdades[i] = (int)(Math.random() * 100); // random genera doubles entre 0 y 1, se multiplica por 100 y se castea como entero
        }
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[" + i + "]" + arregloEdades[i]);
        }
    }
    
}
