/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p9_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P9_U3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int he, hs, ht;
            double costo = 0;
            System.out.println("Utiliza el formato de 24 horas.");
            System.out.println("¿Cual fue la hora de entrada? ");
            he = sc.nextInt();
            System.out.println("¿Cual fue la hora de salida? ");
            hs = sc.nextInt();

            ht = hs - he;
            System.out.println("Usted estuvo " + ht + " horas en total");

            if (ht <= 2)
            {
                costo = ht * 5;
                System.out.println("Por las " + ht + " hrs que estuvo aqui, tiene que pagar $" + costo);
            }

            else if (ht <= 5)
            {
                costo = 2 * 5 + (ht - 2) * 4;
                System.out.println("Por las " + ht + " hrs que estuvo aqui, tiene que pagar $" + costo);
            }

            else if (ht <= 10)
            {
                costo = 2 * 5 + 3 * 4 + (ht - 5) * 3;
                System.out.println("Por las " + ht + " hrs que estuvo aqui, tiene que pagar $" + costo);
            }

            else
            {
                costo = 2 * 5 + 3 * 4 + 5 * 3 + (ht - 10) * 2;
                System.out.println("Por las " + ht + " hrs que estuvo aqui, tiene que pagar $" + costo);
            }
    }
}
