/*
 * Ejercicio Propuesto No24
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_propuesto_No24 {
    public static void main(String[] args){
        Scanner N1 = new Scanner(System.in);
        int A, B, C;
        System.out.print("Ingrese el peso de la esfera A:");
        A = N1.nextInt();
        System.out.print("Ingrese el peso de la esfera B:");
        B = N1.nextInt();
        System.out.print("Ingrese el peso de la esfera C:");
        C = N1.nextInt();
        if (A>B && A>C){
            System.out.println("A tiene mayor peso");
        }else if (B>A && B>C){
            System.out.println("B tiene mayor peso");
        }else{
            System.out.println("C tiene mayor peso");
        }
    }
}
