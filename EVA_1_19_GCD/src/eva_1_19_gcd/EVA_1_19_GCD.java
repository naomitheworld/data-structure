/*
 GREATEST COMMON DIVISOR (MAXIMO COMUN DIVISOR)
 dividendo y divisor
 dividendo/divisor --> residuo
 si residuo = 0
 divisor es el GCD
 si no 
 divisor/residuo
 */
package eva_1_19_gcd;

/**
 *
 * @author moviles
 */
public class EVA_1_19_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(gcd(180, 48));
    }

    public static int gcd(int dividendo, int divisor) {
        int residuo = dividendo % divisor;
        // debo determinar si el algoritmo continua o se detiene
        if (dividendo % divisor == 0) { // me detengo, encontre el mcd
            return divisor;
        }else{
            return gcd(divisor, residuo);
        }
    }
}
