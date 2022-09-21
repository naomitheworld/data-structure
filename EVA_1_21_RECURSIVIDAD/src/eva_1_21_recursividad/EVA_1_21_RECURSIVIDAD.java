/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_21_recursividad;

/**
 *
 * @author gm_na
 */
public class EVA_1_21_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("main " + A());
    }

    public static String A() {
        return "A "+B();
    }

    public static String B() {
        return "B "+C();
    }

    public static String C() {
        return "C ";
    }
}
