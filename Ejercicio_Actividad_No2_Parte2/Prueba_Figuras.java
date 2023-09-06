/*
 *NICOLAS BENJUMEA MOLINA
 */

package com.mycompany.Ejercicio_Actividad_No2_Parte2;

public class Prueba_Figuras{

public static void main(String[] args) {
    Circulo figura1 = new Circulo(2);
    Rectangulo figura2 = new Rectangulo(1,2);
    Cuadrado figura3 = new Cuadrado(3);
    TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    System.out.println("El area del circulo es = " + figura1.CalcularArea());
    System.out.println("El perimetro del circulo es = " + figura1.CalcularPerimetro());
    System.out.println();
    System.out.println("El area del rectangulo es = " + figura2.CalcularArea());
    System.out.println("El perimetro del rectangulo es = " + figura2.CalcularPerímetro());
    System.out.println();
    System.out.println("El area del cuadrado es = " + figura3.CalcularArea());
    System.out.println("El perimetro del cuadrado es = " + figura3.CalcularPerímetro());
    System.out.println();
    System.out.println("El area del triangulo es = " + figura4.CalcularArea());
    System.out.println("El perimetro del triangulo es = " + figura4.CalcularPerimetro());
    figura4.DeterminarTipoTriangulo();
  }
}