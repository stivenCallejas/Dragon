package modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private int idAuto;
    private String marcaAuto;
    private String modeloAuto;
    private int cantidadPuertas;
    private String colorAuto;

    public Modelo(int idAuto, String marcaAuto, String modeloAuto, int cantidadPuertas, String colorAuto) {
        this.idAuto = idAuto;
        this.marcaAuto = marcaAuto;
        this.modeloAuto = modeloAuto;
        this.cantidadPuertas = cantidadPuertas;
        this.colorAuto = colorAuto;
    }

   

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getColorAuto() {
        return colorAuto;
    }

    public void setColorAuto(String colorAuto) {
        this.colorAuto = colorAuto;
    }
}
