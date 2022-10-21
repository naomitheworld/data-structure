/*
add -> push -> agrega un elemento en la cima
peek -> lee el elemento en la cima
pop -> lee y borra el elemento en la cima
 */
package eva2_5_stack;

/**
 *
 * @author moviles
 */
public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.imprimir();
        System.out.println("cima de la pila: " + myStack.peek());
        myStack.imprimir();
        try{
        System.out.println("cima de la pila: " + myStack.pop());
        }catch(Exception e){
        }
        myStack.imprimir();
    }
    
}
