/*
 * Ejercicio Propuesto No23
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_propuesto_No23 {
    public static void main(String[] args){
        Scanner N1 = new Scanner(System.in);
        int A, B, C;
        System.out.print("Ingrese el valor de A:");
        A = N1.nextInt();
        System.out.print("Ingrese el valor de B:");
        B = N1.nextInt();
        System.out.print("Ingrese el valor de C:");
        C = N1.nextInt();
        double Solucion1 = 0, Solucion2 = 0, discriminante = (Math.pow(B, 2)) - (4*A*C);
        if (discriminante<0){
            System.out.println("La ecuación de segúndo grado no tiene solución");
        }else{
            Solucion1 = ((-B) + Math.sqrt(discriminante))/(2*A);
            Solucion2 = ((-B) - Math.sqrt(discriminante))/(2*A);
            System.out.println("La ecuación tiene las soluciónes: " + Solucion1 + " y " + Solucion2);
        }
    }
}
