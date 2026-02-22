package Factory;

import EjemploDos.Circulo;
import EjemploDos.Cuadrado;
import EjemploDos.Figura;

public class FiguraFactory {
    public static Figura getFigura(String tipo){
        if(tipo.equalsIgnoreCase("CIRCULO")){
            return new Circulo();
        } else if(tipo.equalsIgnoreCase("CUADRADO")){
            return new Cuadrado();
        }
        return null;
    }
}
