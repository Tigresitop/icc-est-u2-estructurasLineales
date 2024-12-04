import Materia.Stacks.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runStack();
        
    }

    public static void runStack() {
        //Instanciar la clase
        Stack stack = new Stack();
        

        //Agregar elementos a la pila
        stack.push(5);
        stack.push(7);
        stack.push(12);
        stack.push(23);

        //Mostrar elementos de la pila
        System.out.println("Cima   -> "+ stack.peek());
        System.out.println("Retirar-> "+ stack.pop());
        System.out.println("Cima   -> "+ stack.peek());
        System.out.println("Retirar-> "+ stack.pop());
        System.out.println("Cima   -> "+ stack.peek());
    }
}
