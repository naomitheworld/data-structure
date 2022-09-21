/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_20_factorial;

/**
 *
 * @author gm_na
 */
public class EVA_1_20_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(100));
    }

    //5 * 4 * 3 * 2 * 1
    public static int factorial(int valor) {
        //factorial(0) = 1
        if (valor == 0) {
            return 1;
        } else {
            return (valor * factorial(valor - 1));
        }
    }
}
