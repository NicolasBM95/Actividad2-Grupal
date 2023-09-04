/*
 * Ejercicio resuelto No11
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_resuelto_No11 {
    public static void main(String[] args){
        int numero1, numero2, numero3, Mayor;
        Scanner N1 = new Scanner(System.in);
        System.out.print("Ingrese el valor del primer numero: ");
        numero1 = N1.nextInt();
        System.out.print("Ingrese el valor del segundo numero: ");
        numero2 = N1.nextInt();
        System.out.print("Ingrese el valor del tercer numero: ");
        numero3 = N1.nextInt();
        if (numero1>numero2 && numero1>numero3){
            Mayor = numero1;
        }else if (numero2>numero1 && numero2>numero3){
            Mayor = numero2;
        }else{
            Mayor = numero3;
        }
        System.out.println("“EL VALOR MAYOR ENTRE: " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + Mayor);
    }
}
