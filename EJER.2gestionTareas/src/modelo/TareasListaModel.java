package modelo;

import java.util.LinkedList;

public class TareasListaModel {
    private LinkedList<TareaModel> listaTareas;

    public TareasListaModel() {
        listaTareas = new LinkedList<>();
    }

    public void agregarTarea(String nombre, String descripcion) {
        TareaModel tarea = new TareaModel(nombre, descripcion);
        listaTareas.add(tarea);
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.remove(indice);
        }
    }

    public LinkedList<TareaModel> getListaTareas() {
        return listaTareas;
    }
}
