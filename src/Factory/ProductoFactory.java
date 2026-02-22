package Factory;
import Model.Alimento;
import Model.Electronico;
import Model.Entidad;

// Fábrica para crear productos
public class ProductoFactory {
    public static Entidad fabricar(TipoProducto tipo){
        return switch (tipo){
            case ELECTRONICO -> new Electronico();
            case ALIMENTO -> new Alimento();
        };
    }
}
