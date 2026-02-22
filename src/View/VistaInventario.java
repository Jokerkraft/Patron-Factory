package View;

import java.util.Scanner;

// Vista para la gestión de inventario
public class VistaInventario {
    private Scanner entrada = new Scanner(System.in);

    // Método para mostrar mensajes al usuario
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    // Método para mostrar el menú principal
    public int mostrarMenu(){
        System.out.println("\n--- GESTIÓN DE INVENTARIO ---");
        System.out.println("1. Agregar Electrónico");
        System.out.println("2. Agregar Alimento");
        System.out.println("3. Ver Inventario");
        System.out.println("4. Salir");
        System.out.print("Seleccione: ");
        return entrada.nextInt();
    }
}
