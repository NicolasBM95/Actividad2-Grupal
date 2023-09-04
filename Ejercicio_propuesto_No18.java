/*
 * Ejercicio Propuesto No18
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_propuesto_No18 {

    public static void main(String[] args) {
        double ReteFuente, SalarioBruto, SalarioNeto;
        int codigo_empleado, HorasMes, ValorHora;
        String nombre;
        Scanner N1 = new Scanner(System.in);
        System.out.println("Ingrese el codigo del empleado: ");
        codigo_empleado = N1.nextInt();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = N1.next();
        System.out.println("Ingrese el numero de horas trabajadas al mes: ");
        HorasMes = N1.nextInt();
        System.out.println("Ingrese el valor de la hora trabajada: ");
        ValorHora = N1.nextInt();
        System.out.println("Ingrese el porcentaje de retencion en la fuente: ");
        ReteFuente = N1.nextFloat();
        SalarioBruto = ValorHora*HorasMes;
        SalarioNeto = SalarioBruto-(SalarioBruto*(ReteFuente/100));
        System.out.println("Codigo: " + codigo_empleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Bruto: " + SalarioBruto);
        System.out.println("Salario Neto: " + SalarioNeto);
    }
}
