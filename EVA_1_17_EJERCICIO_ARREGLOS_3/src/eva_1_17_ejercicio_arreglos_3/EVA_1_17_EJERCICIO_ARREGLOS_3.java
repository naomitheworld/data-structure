/*
PRACTICA 3
genera una matriz de 5x5 enteros, llenar con nums aleatorios
entre 1 y 100 e imprimir
[1][2][3][4][5]
[6][7][8][9][10]
[11][12][13][14][15]
[16][17][18][19][20]
[21][22][23][24][25]
crear una copia de la matriz, pero en orden inverso:
[25][24][23][22][21]
[20][19][18][17][16]
...
 */
package eva_1_17_ejercicio_arreglos_3;

/**
 *
 * @author moviles
 */
public class EVA_1_17_EJERCICIO_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*100) + 1;
            }
        }
        imprimir(matrix);
        System.out.println("COPIA INVERTIDA");
        int[][] copia = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                copia[i][j] = matrix[(matrix.length-1)-i][(matrix[i].length-1)-j];
            }
        }
        imprimir(copia);
    }
    
    public static void imprimir(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
