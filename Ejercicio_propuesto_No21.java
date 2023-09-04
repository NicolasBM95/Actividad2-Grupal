/*
 * Ejercicio Propuesto No21
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_propuesto_No21 {
    public static void main(String[] args){
        double lado1, lado2, lado3, perimetro, semiperimetro, area;
        Scanner N1 = new Scanner(System.in);
        System.out.println("ingrese el lado 1: ");
        lado1 = N1.nextDouble();
        System.out.println("ingrese el lado 2: ");
        lado2 = N1.nextDouble();
        System.out.println("ingrese el lado 3: ");
        lado3 = N1.nextDouble();
        perimetro = lado1+lado2+lado3;
        semiperimetro = perimetro/2;
        area = Math.sqrt((semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El semiperimetro es: " + semiperimetro);
        System.out.println("El area es: " + area);
    }
}
