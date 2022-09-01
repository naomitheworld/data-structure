/*
 pedir numero de grupos
pedir numero de alumnos por grupo
capturar calificaciones
 */
package eva_1_11_ejepmlo_arreglos;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class EVA_1_11_EJEPMLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int no_grps = 0;
        Scanner s = new Scanner(System.in);
        int califs[][];
        // primer dimension --> grupos
        // segunda dimension --> estudiantes x gpo
        
        // determinar los grupos
        System.out.println("Ingrese el numero de grupos: ");
        no_grps = s.nextInt();
        califs = new int[no_grps][];
        
        // para cada grupo: cuantos estudiantes necesitas?
        for (int i = 0; i < califs.length; i++) {
            System.out.println("Ingrese el numero de alumnos para el grupo " + (i+1));
            int no_alumns = s.nextInt();
            califs[i] = new int[no_alumns];
        }
        
        for (int i = 1; i <= califs.length; i++) {
            for (int j = 1; j <= califs[i].length; j++) {
                System.out.println("Ingrese la calificacion para el alumno " + j + " del grupo  " + i);
                califs[i][j] = s.nextInt();                
            }
        }
        
        for (int i = 0; i < califs.length; i++) {
            for (int j = 0; j < califs.length; j++) {
                System.out.println("[" + califs[i][j] + "]");   
            }
            System.out.println("");
        }
        /*
        
        /* well i tried...
        
        
        int [][] califs = new int[no_grps][no_alumns];
        
        
        */
    }
    
}
