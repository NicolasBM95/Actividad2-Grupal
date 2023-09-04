/*
 * Ejercicio resuelto No10
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_resuelto_No10 {
    public static void main(String[] args){
        int estratoSocial, patrimonio, pagomatricula;
        Scanner N1 = new Scanner(System.in);
        System.out.print("Ingrese el numero de inscripcion: ");
        String numeroInscripcion = N1.next();
        System.out.print("Ingrese el nombre: ");
        N1.nextLine();
        String nombre = N1.nextLine();
        System.out.print("Ingrese el valor del patrimonio: ");
        patrimonio = N1.nextInt();
        System.out.print("Ingrese el valor del estrato social: ");
        estratoSocial = N1.nextInt();
        pagomatricula = 50000;
        if (patrimonio>2000000 && estratoSocial>3){
            pagomatricula = pagomatricula + ((pagomatricula*3)/100);
        }
        System.out.println("El estudiante con número de inscripción: " + numeroInscripcion + " y nombre: " + nombre + " debe pagar $: " + pagomatricula );
    }
}
