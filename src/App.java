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

        // Imprimir la pila usando printStack
        System.out.println("Contenido de la pila:");
        stack.printStack();
        System.out.println(""); // Esto imprimira directamente los elementos de la pila

        // Obtener y mostrar el tamaño de la pila
        System.out.println("Tamaño de la pila: " + stack.getSize());


        //Mostrar elementos de la pila
        System.out.println("Cima   -> "+ stack.peek());
        System.out.println("Retirar-> "+ stack.pop());
        System.out.println("Cima   -> "+ stack.peek());
        System.out.println("Retirar-> "+ stack.pop());
        System.out.println("Cima   -> "+ stack.peek());
    }
}
