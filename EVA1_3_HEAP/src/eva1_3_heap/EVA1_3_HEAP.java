/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_heap;

/**
 *
 * @author moviles
 */
public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // en java las direcciones de memoria se les llama referencias
        // en otros lenguajes los llamamos apuntadores (pointers)
        // un apuntador si es una direccion fisica, en java son referencias (o alias para las direcciones)
        // obj y obj2 guardan referencias
        int x = 10;
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(x);
        System.out.println(obj.valor); // el punto es un operador de des-referenciacion
        System.out.println(obj2);
    }
    
}
    class Prueba{
        public int valor = 100;
    }
