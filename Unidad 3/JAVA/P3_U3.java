/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P3_U3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int dia;
        System.out.println("Programa para los dias de la semana.");
        System.out.println("Introdusca un número para saber que día es: ");
        dia=sc.nextInt();
                switch(dia){
                    case 1:
                        System.out.println("Es lunes");
                        break;
                    case 2:
                        System.out.println("Es martes");
                        break;
                    case 3:
                        System.out.println("Es miercoles");
                        break;
                    case 4:
                        System.out.println("Es jueves");
                        break;
                    case 5:
                        System.out.println("Es viernes");
                        break;
                    case 6:
                        System.out.println("Es sabado");
                        break;
                    case 7:
                        System.out.println("Es domingo");
                        break;
                }
    }
}
