package modelo;

import java.util.Stack;

class HistorialNavegacion {
    private Stack<PageWeb> atras;
    private Stack<PageWeb> adelante;
    private PageWeb actual;

    public HistorialNavegacion() {
        atras = new Stack<>();
        adelante = new Stack<>();
        actual = new PageWeb("https://www.example.com", "Página de Inicio");
    }

    public void visitarPagina(PageWeb pagina) {
        atras.push(actual);
        adelante.clear();
        actual = pagina;
    }

    public boolean retroceder() {
        if (!atras.isEmpty()) {
            adelante.push(actual);
            actual = atras.pop();
            return true;
        }
        return false;
    }

    public boolean avanzar() {
        if (!adelante.isEmpty()) {
            atras.push(actual);
            actual = adelante.pop();
            return true;
        }
        return false;
    }

    public PageWeb getActual() {
        return actual;
    }
}
