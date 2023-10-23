/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p7_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P7_U3 {

    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            double T;
            System.out.println("¿Qué temperatura hay hoy?");
            T = sc.nextInt();

            if (T >= 27)
            {
                System.out.println("¡Hace calor!, ¿vamos por un helado?");
            }
            else if (T < 27 && T >= 20)
            {
                System.out.println("¡El clima hoy es agradable!");
            }
            else
            {
                System.out.println("!Hace frío! deberiamos de abrigarnos.");

            }
        }
    }
