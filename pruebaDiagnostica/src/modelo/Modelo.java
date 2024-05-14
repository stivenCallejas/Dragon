/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 57312
 */
public class Modelo {
  

  private int numAsistentes;
  private int asistentesIngresados;
  
  public void iniciarEvento() {
    if(asistentesIngresados >= numAsistentes / 2) {
      System.out.println("El evento ha iniciado"); 
    }
  }
  
  public void ingresarAsistente(boolean tieneEntrada) {
    if(tieneEntrada) {
      asistentesIngresados++;
    }
  }
  
}

