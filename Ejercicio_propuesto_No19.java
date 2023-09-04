/*
 * Ejercicio Propuesto No19
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_propuesto_No19 {
    public static void main(String[] args){
        double lado, perimetro, area, altura;
        Scanner N1 = new Scanner(System.in);
        System.out.println("ingrese el lado: ");
        lado = N1.nextDouble();
        perimetro = lado*3;
        altura = Math.sqrt((Math.pow(lado, 2))-(Math.pow((lado/2), 2)));
        area = (lado*altura)/2;
        System.out.println("Perimetro: " + perimetro + "Altura: " + altura + "Area: " + area);
    }
    
}
