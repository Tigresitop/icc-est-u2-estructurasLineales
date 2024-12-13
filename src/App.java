import java.util.Scanner;

import Controller.MenuController;
import Ejercicio_01_sing.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Queues.Queue;
import Materia.Queues.QueueGeneric;
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import Models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        runSignValidator();
        runStackSorter();
        //runContactMannager();
        //runStack();
        //runStackGeneric();
        //runQueue();
        //runQueueGeneric();

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
    public static void runStackGeneric() {
        StackGeneric<Pantalla> router = new StackGeneric<>();

        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        System.out.println("Regreso a " + (router.popNode().getNext().getValue()).getRuta());
        System.out.println("Estoy en " + router.peek().getRuta());
        
        router.push(new Pantalla(1,"Settings Page","/home/menu/setting"));

        System.out.println("Pantallas = " + router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());
        router.printStack();


        
        
        
    }

    public static void runQueue() {
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println("Contenido de la cola:");
        cola.printQueue();
        System.out.println("Tamaño de la cola: " + cola.getSize());
        System.out.println("Elemento en el frente: " + cola.peek());
        System.out.println("Desencolado: " + cola.dequeue());
        System.out.println("Contenido de la cola después de desencolar:");
        cola.printQueue();
        
    }

    public static void runQueueGeneric() {
        QueueGeneric<String> colaGen = new QueueGeneric<>();
        colaGen.enqueue("Primero");
        colaGen.enqueue("Segundo");
        colaGen.enqueue("Tercero");
        colaGen.enqueue("Cuarto");

        System.out.println("Contenido de la cola genérica:");
        colaGen.printQueue();
        System.out.println("Tamaño de la cola genérica: " + colaGen.getSize());
        System.out.println("Elemento en el frente: " + colaGen.peek());
        System.out.println("Desencolado: " + colaGen.dequeue());
        System.out.println("Contenido de la cola genérica después de desencolar:");
        colaGen.printQueue();
    }

    private static void runContactMannager() {
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }

    public static void runSignValidator() {
        SignValidator validator = new SignValidator();
    
        String input1 = "([]){}";
        String input2 = "({)}";
        String input3 = "[{()}]";
        
        System.out.println("Input: " + input1 + " -> " + validator.isValid(input1));
        System.out.println("Input: " + input2 + " -> " + validator.isValid(input2));
        System.out.println("Input: " + input3 + " -> " + validator.isValid(input3));
    }
    


    public static void runStackSorter() {
        StackSorter sorter = new StackSorter();
        StackGeneric<Integer> stack = new StackGeneric<>();
        
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        
        System.out.println("Original Stack:");
        stack.printStack();
        
        StackGeneric<Integer> sortedStack = sorter.sort(stack);
        
        System.out.println("Sorted Stack:");
        sortedStack.printStack();
    }
    
    

}
