package EjemploUno;

import Factory.VechiculoFactory;

public class Cliente {
    public static void main(String[] args) {
        VechiculoFactory factory = new VechiculoFactory();

        // Crear coche
        Vehiculo coche = factory.crearVehiculo("COCHE");
        coche.conducir();

        // Crear moto
        Vehiculo moto = factory.crearVehiculo("MOTO");
        moto.conducir();

        // Crear camion
        Vehiculo camion = factory.crearVehiculo("CAMION");
        camion.conducir();
    }
}
