/*
 * Ejercicio resuelto No12
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_resuelto_No12 {
    public static void main(String[] args){
        String nombre;
        int horas, valorHora, extras, ultraExtras, salario;
        Scanner N1 = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = N1.nextLine();
        System.out.print("Ingrese las horas: ");
        horas = N1.nextInt();
        System.out.print("Ingrese el valor de la hora: ");
        valorHora = N1.nextInt();
        if (horas>40){
            extras = horas-40;
            if (extras>8){
                ultraExtras = extras-8;
                salario = valorHora*3*ultraExtras + valorHora*2*8 + valorHora*40;
            }else{
                salario = valorHora*2*extras + valorHora*40;
            }
        }else{
            salario = valorHora*horas;
        }
        System.out.println("El trabajador " + nombre + " devengó: $" + salario);
    }
}
