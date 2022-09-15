/*
2 CONDICIONES
1: Metodo que se llama a si mismoç
    algun tipo de trabajo
2: un mecanismo para detener la recursividad
 */
package eva_1_18_recursividad;

/**
 *
 * @author moviles
 */
public class EVA_1_18_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        falsoForDes(5);
        falsoForAsc(1, 5);
    }
    
 // FALSO FOR
 // Imprimir una lista de numeros de mayor a menor (de manera recursiva)
    // recibo un valor falsoForSes(5) --> "5 - 4 - 3 - 2 - 1"
    public static void falsoForDes(int valor){
        //que voy a hacer "imprimir valor"
        // llamada recursiva "falsoForDes(valor-1)
        // detener la llamada recursiva "cuando valor = 1"
        // Si es 1 me detengo, si no, llamada recursiva
        if (valor==1) {
            System.out.println(valor);
        }else{
            System.out.print(valor + " - ");
            falsoForDes(valor-1);
        }
        
        /* solucion del prof
        System.out.println(valor);
        if (valor>1) {
            falsoForDes(valor - 1);
        }*/
    }
    
    //falsoForAsc(5,1) --> 1 - 2 - 3 - 4 - 5
    public static void falsoForAsc(int inicio, int fin){
        System.out.print(inicio + " - ");
        if (inicio<fin) {
            falsoForAsc(inicio + 1, fin);
        }
    }
}
