/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_9_arreglos_multidim;

/**
 *
 * @author moviles
 */
public class EVA_1_9_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizDatos = new int[3][5];
        System.out.println("filas: " + matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++) { // primer dimension (3 filas)
            //System.out.println("columnas: " + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++) { // segunda dimension (5 columnas)
                matrizDatos[i][j] = 100;
                System.out.print("[" + matrizDatos[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
