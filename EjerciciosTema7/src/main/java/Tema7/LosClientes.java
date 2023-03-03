package Tema7;

import java.util.HashMap;
import java.util.Scanner;

public class LosClientes {
    HashMap<String, Integer> clientes = new HashMap<>();

    public void agregarCliente(String nombre, int edad){
        clientes.put(nombre, edad);
    }

    public void mostrarClientes(){
        for (String nombre : clientes.keySet()) {
            System.out.println("Cliente n.º " + clientes.get(nombre) + " [ " + nombre + " ]");
        }
    }

    public static void main(String[] args) {
        LosClientes clientes = new LosClientes();

        int numeroClientes = 0;

        boolean bool = true;

        while (bool) {
            System.out.println("--Menu--");
            System.out.println("1. Mostrar clientes");
            System.out.println("2. Crear un cliente");
            System.out.println("3. Salir");
            int opcion = 0;
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    clientes.mostrarClientes();
                    break;
                case 2:
                    System.out.println("¿Nombre?");
                    Scanner teclado1 = new Scanner(System.in);
                    String nombre = teclado1.nextLine();
                    numeroClientes += 1;
                    clientes.agregarCliente(nombre, numeroClientes);
                    System.out.println("Cliente n.º " + numeroClientes + " [ " + nombre + " ] añadido");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    bool = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
