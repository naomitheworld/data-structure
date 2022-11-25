/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_comparator;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author moviles
 */
public class EVA3_2_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> miLista = new <Integer>LinkedList();
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        System.out.println(miLista);
        // ordenar --> comparator
        // comparator es una interfaz
        Comparator ordenar = new Comparator(){
            @Override
            public int compare(Object o1, Object o2){
                Integer v1 = (Integer) o1;
                Integer v2 = (Integer) o2;
                return v1-v2;
            }
        };
        miLista.sort(ordenar);
        System.out.println(miLista);
        
        LinkedList<Persona> listaPersonas = new <Persona>LinkedList();
        listaPersonas.add(new Persona("juan", "perez", "jolote", 50, 100.0));
        listaPersonas.add(new Persona("pedro", "chavez", null, edad, salario));
        listaPersonas.add(new Persona("alberto", "perez", null, edad, salario));
        listaPersonas.add(new Persona("dora", "dominguez", null, edad, salario));
        listaPersonas.add(new Persona("estela", "sanchez", null, edad, salario));
        listaPersonas.add(new Persona("monica", "molina", null, edad, salario));
        listaPersonas.add(new Persona("esteban", "", null, edad, salario));
    }
    
    class Persona{
        private String nombre;
        private String paterno;
        private String materno;
        private int edad;
        private double salario;

        public Persona(String nombre, String paterno, String materno, int edad, double salario) {
            this.nombre = nombre;
            this.paterno = paterno;
            this.materno = materno;
            this.edad = edad;
            this.salario = salario;
        }
        
    }
    
}
