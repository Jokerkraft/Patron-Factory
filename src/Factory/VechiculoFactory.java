package Factory;

import EjemploUno.Camion;
import EjemploUno.Coche;
import EjemploUno.Moto;
import EjemploUno.Vehiculo;

public class VechiculoFactory {
    public Vehiculo crearVehiculo(String tipo){
        if(tipo == null){
            return null;
        }
        if(tipo.equalsIgnoreCase("COCHE")){
            return new Coche();
        } else if(tipo.equalsIgnoreCase("MOTO")){
            return new Moto();
        } else if(tipo.equalsIgnoreCase("CAMION")){
            return new Camion();
        }
        return null;
    }
}
