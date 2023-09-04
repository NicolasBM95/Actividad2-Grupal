/*
 * Ejercicio resuelto No14
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_resuelto_No14 {
    public static void main(String[] args){
        int Ventas1, Ventas2, Ventas3, SalarioGeneral;
        double SalarioV1, SalarioV2, SalarioV3;
        Scanner N1 = new Scanner(System.in);
        System.out.print("Ingrese las ventas del departamento 1: ");
        Ventas1 = N1.nextInt();
        System.out.print("Ingrese las ventas del departamento 2: ");
        Ventas2 = N1.nextInt();
        System.out.print("Ingrese las ventas del departamento 3: ");
        Ventas3 = N1.nextInt();
        System.out.print("Ingrese el salario de los vendedores de cada departamento: ");
        SalarioGeneral = N1.nextInt();
        double UmbralVentas = (Ventas1+Ventas2+Ventas3)*0.33;
        if (Ventas1 > UmbralVentas){
        SalarioV1 = SalarioGeneral + 0.2*SalarioGeneral;
        }else{
        SalarioV1 = SalarioGeneral;
        }
        if (Ventas2 > UmbralVentas){
        SalarioV2 = SalarioGeneral + 0.2*SalarioGeneral;
        }else{
        SalarioV2 = SalarioGeneral;
        }
        if (Ventas3 > UmbralVentas){
        SalarioV3 = SalarioGeneral + 0.2*SalarioGeneral;
        }else{
        SalarioV3 = UmbralVentas;
        }
        System.out.println("Salario vendedores depto. 1:" + SalarioV1 + " Salario vendedores depto. 2:" + SalarioV2 + " Salario vendedores depto. 3:" + SalarioV3);
    }
}
