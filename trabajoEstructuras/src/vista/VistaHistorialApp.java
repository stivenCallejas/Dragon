package vista;

// VistaHistorialApp.java

public class VistaHistorialApp extends Application {
    public void start(Stage primaryStage) throws Exception {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);
        vista.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}