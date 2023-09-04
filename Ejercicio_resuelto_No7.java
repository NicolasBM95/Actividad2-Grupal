/*
 * Ejercicio resuelto No7
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_resuelto_No7 {
    public static void main(String[] args){
        double A, B;
        Scanner N1 = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        A = N1.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        B = N1.nextDouble();
        if (A>B){
            System.out.println("A es mayor que B");
        }
        else{
            System.out.println("B es mayor que A");
        }
    }
}
