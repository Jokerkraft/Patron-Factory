package EjemploDos;

import Factory.FiguraFactory;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = FiguraFactory.getFigura("CIRCULO");
        figura1.dibujar(); // Salida: Dibujando un Circulo

        Figura figura2 = FiguraFactory.getFigura("CUADRADO");
        figura2.dibujar(); // Salida: Dibujando un Cuadrado
    }
}
