package Model;

import java.util.ArrayList;
import java.util.List;

// Lógica Genérica de Almacenamiento
public class AlmacenModel<T extends Entidad> {
    private List<T> items = new ArrayList<>();

    public void guardar(T item){
        items.add(item);
    }

    public List<T> obtenerTodos(){
        return items;
    }
}
