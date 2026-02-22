package Controller;

import Factory.ProductoFactory;
import Factory.TipoProducto;
import Model.AlmacenModel;
import Model.Entidad;
import View.VistaInventario;

// Controlador Genérico para el Inventario
public class InventarioController {
    private AlmacenModel<Entidad> modelo;
    private VistaInventario vista;

    // Constructor con sus independenciaa
    public InventarioController(AlmacenModel<Entidad> modelo, VistaInventario vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Procesar la opción seleccionada por el usuario
    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            processarOpcion(opcion);
        } while (opcion != 4);
    }

    private void processarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> {
                Entidad e = ProductoFactory.fabricar(TipoProducto.ELECTRONICO);
                modelo.guardar(e);
                vista.mostrarMensaje("¡Electrónico registrado!");
            }
            case 2 -> {
                Entidad a = ProductoFactory.fabricar(TipoProducto.ALIMENTO);
                modelo.guardar(a);
                vista.mostrarMensaje("¡Alimento registrado!");
            }
            case 3 -> {
                vista.mostrarMensaje("\n--- LISTADO ---");
                for (Entidad item : modelo.obtenerTodos()) {
                    vista.mostrarMensaje("- " + item.getDetalles());
                }
            }
        }
    }
}
