/*
 * Ejercicio resuelto No15
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_resuelto_No15 {
    public static void main(String[] args){
        Scanner N1 = new Scanner(System.in);
        int A, B, C, D;
        System.out.print("Ingrese el peso de la esfera A:");
        A = N1.nextInt();
        System.out.print("Ingrese el peso de la esfera B:");
        B = N1.nextInt();
        System.out.print("Ingrese el peso de la esfera C:");
        C = N1.nextInt();
        System.out.print("Ingrese el peso de la esfera D:");
        D = N1.nextInt();
        if (A == B && A == C){
            if (D > A){
                System.out.println("La esfera D es la diferente y es de mayor peso");
            }else{
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
        }
        if (A == B && A == D){
            if (C > A){
                System.out.println("La esfera C es la diferente y es de mayor peso");
            }else{
                System.out.println("La esfera C es la diferente y es de menor peso");
            }
        }
        if (A == C && A == D){
            if (B > A){
                System.out.println("La esfera B es la diferente y es de mayor peso");
            }else{
                System.out.println("La esfera B es la diferente y es de menor peso");
            }
        }
        if (B == C && B == D){
            if (A > B){
                System.out.println("La esfera A es la diferente y es de mayor peso");
            }else{
                System.out.println("La esfera A es la diferente y es de menor peso");
            }
        }
    }
}
