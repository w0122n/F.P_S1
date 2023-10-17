/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_3 {

    public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
        int c1, c2, c3, c4, c5, c6, prom;
        
        System.out.print("Escribe la 1ra calificación:");
        c1 = sc.nextInt ();
        System.out.print("Escribe la 2da calificación:");
        c2 = sc.nextInt ();
        System.out.print("Escribe la 3ra calificación:");
        c3 = sc.nextInt ();
        System.out.print("Escribe la 4ta calificación:");
        c4 = sc.nextInt ();
        System.out.print("Escribe la 5ta calificación:");
        c5 = sc.nextInt ();
        System.out.print("Escribe la 6ta calificación:");
        c6 = sc.nextInt ();
        prom = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
        System.out.println("El resultado es " + prom);
       
    }
}
