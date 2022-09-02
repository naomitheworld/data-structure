/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_13_paso_valor_ref;

/**
 *
 * @author moviles
 */
public class EVA_1_13_PASO_VALOR_REF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorPrueba = 100;
        System.out.println("Valor = " + valorPrueba);
        incVal(valorPrueba);
        System.out.println("Valor incrementado = " + valorPrueba);
        //--------------------------------------------------------
        PruebaValor prueba = new PruebaValor();
        prueba.x = 100;
        System.out.println("Valor (obj) = " + prueba.x);
        incVal(prueba);
        System.out.println("Valor incrementado (obj) = " + prueba.x);
    }
    
    public static void incVal(int valor){
        valor++;
    }
    
    public static void incVal(PruebaValor pruebaVal){
        pruebaVal.x++;
    }
    
}

class PruebaValor{
        int x;
    }
