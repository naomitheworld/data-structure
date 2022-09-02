/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_12_copia_objetos;

/**
 *
 * @author moviles
 */
public class EVA_1_12_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, copiaValor;
        
        valor = 100;
        copiaValor = valor;
        System.out.println("valor = " + valor);
        System.out.println("copia = " + copiaValor);
        valor++;
        System.out.println("valor = " + valor);
        System.out.println("copia = " + copiaValor);
        
        // ahora con objetos
        PruebaValor prueba = new PruebaValor();
        prueba.x = 1000;
        PruebaValor pruebaCopia = prueba;
        System.out.println("ahora con objetos");
        System.out.println("prueba " + prueba.x);
        System.out.println("prueba copia " + pruebaCopia.x);
        prueba.x++;
        System.out.println("prueba " + prueba.x);
        System.out.println("prueba copia " + pruebaCopia.x);
    }
    
}

class PruebaValor{
    int x;
}