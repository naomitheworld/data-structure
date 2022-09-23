/*
PEDIR POSICION
 */
package eva_1_22_fibonacci;

import java.util.Scanner;

/**
 *
 * @author gm_na
 */
public class EVA_1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int posicion;
        System.out.println("------SERIE FIBONACCI------");
        System.out.println("Hasta que posicion?:");
        posicion = s.nextInt();
        for (int i = 1; i <= posicion; i++) {        
            System.out.print(fibonacci(i) + " - ");
        }
    }
    
    public static int fibonacci(int p) {
        if (p <= 1) {
            return 1;
        } else {
            return (fibonacci(p - 1) + fibonacci(p - 2));
        }
    }
}
