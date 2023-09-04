/*
 * Ejercicio resuelto No13
 */
package com.mycompany.ejercicios_actividad_no2;

import java.util.Scanner;

public class Ejercicio_resuelto_No13 {
    public static void main(String[] args){
        int valorcompra, descuento;
        String color;
        Scanner N1 = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        valorcompra = N1.nextInt();
        System.out.print("Ingrese el color de la bolita: ");
        N1.nextLine();
        color = N1.nextLine();
        descuento = 0;
        if (color.equals("VERDE")){
            descuento = 10;
        }if (color.equals("AMARILLO")){
            descuento = 25;
        }if (color.equals("AZUL")){
            descuento = 50;
        }if (color.equals("ROJO")){
            descuento = 100;
        }
        double pago = valorcompra-valorcompra*(descuento/100.0);
        System.out.println("El cliente debe pagar: $" + pago);
    }
}
