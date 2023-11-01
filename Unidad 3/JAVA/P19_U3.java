/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p19_u3;
import java.util.Scanner;

/**
 *
 * @author hannm
 */
public class P19_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
            int N, c = 0, my = 0, mn = 0;
            double num;

            System.out.println("Ingrese la cantidad de números a procesar: ");
            N = sc.nextInt();

            for (int i = 0; i < N; i++)
            {
                System.out.println("Ingresa un número");
                num = sc.nextInt(); 
                if (num == 0)
                {
                    c++;
                }
                else if (num > 0)
                {
                    my++;
                }
                else
                {
                    mn++;
                }
            }
        System.out.println("El total de números cero es: " + c);
        System.out.println("El total de números mayores a cero es: " + my);
        System.out.println("El total de números menores a cero es: " + mn);
    }
}