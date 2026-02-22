package Ejercicio;

import Controller.InventarioController;
import Model.AlmacenModel;
import Model.Entidad;
import View.VistaInventario;

// Aplicación principal
public class SistemaApp {
    public static void main(String[] args) {
        // Iniclaizamos las piezas
        AlmacenModel<Entidad> modelo = new AlmacenModel<>();
        VistaInventario vista = new VistaInventario();

        // El controlador une todo
        InventarioController controller = new InventarioController(modelo, vista);

        // Iniciamos la aplicación
        controller.iniciar();
    }
}
