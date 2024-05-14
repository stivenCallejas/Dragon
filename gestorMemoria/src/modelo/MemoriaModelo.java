// Paquete modelo
package modelo;

import com.sun.source.tree.Scope;
import java.util.ArrayList;
import java.util.Stack;

public class MemoriaModelo {
    private ArrayList<Variable> variables;
    private Stack<Scope> scopes;

    public MemoriaModelo() {
        variables = new ArrayList<>();
        scopes = new Stack<>();
    }

    // Métodos para asignar, liberar y gestionar la memoria
    // (código de los métodos aquí)
}
