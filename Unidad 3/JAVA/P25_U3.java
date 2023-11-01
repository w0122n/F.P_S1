/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p25_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P25_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char operador;
        double N1, N2, r;

        do {
            System.out.println("Ingrese un operador (+, -, *, /) o 'q' para salir:");
            operador = sc.next().charAt(0);

            if (operador != 'q') {
                System.out.println("Ingrese el 1er número:");
                N1 = sc.nextDouble();

                System.out.println("Ingrese el 2do número:");
                N2 = sc.nextDouble();

                switch (operador) {
                    case '+':
                        r = N1 + N2;
                        break;
                    case '-':
                        r = N1 - N2;
                        break;
                    case '*':
                        r = N1 * N2;
                        break;
                    case '/':
                        r = N1 / N2;
                        break;
                    default:
                        System.out.println("Operador no válido. Inténtea nuevamente.");
                        continue;
                }

                System.out.println("El resultado es: " + r);
            }

        } while (operador != 'q');
    }
}