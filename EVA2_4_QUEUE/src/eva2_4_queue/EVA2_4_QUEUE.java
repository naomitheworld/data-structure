/*
add -> al final de la lista
poll -> lee y elimina el primer elemento de la lista
peek -> lee el primer elemento de la lista
 */
package eva2_4_queue;

/**
 *
 * @author moviles
 */
public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue myQueue = new MyQueue();
        // fifo ---> first in first out
        myQueue.add(10); // 1ro en llegar, 1ro en irse
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50); // ultimo en llegar, ultimo en irse
        System.out.println("Primer valor en llegar es: " + myQueue.peek());
        myQueue.imprimir();
    }
    
}
