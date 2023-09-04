/*
 * Ejercicio Propuesto No22
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_propuesto_No22 {
    public static void main(String[] args){
        Scanner N1 = new Scanner(System.in);
        String  nombre;
        int SalarioHora, HorasMes;
        System.out.print("Ingrese el nombre del empleado:");
        nombre = N1.nextLine();
        System.out.print("Ingrese el salario basico por hora:");
        SalarioHora = N1.nextInt();
        System.out.print("Ingrese las horas trabajadas:");
        HorasMes = N1.nextInt();
        int SalarioMensual = SalarioHora*HorasMes;
        if (SalarioMensual>450000){
            System.out.println(nombre + " " + SalarioMensual);
        }else{
            System.out.println(nombre);
        }
    }
}
