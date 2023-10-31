/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p13_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P13_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int c, total, num, n = 0, p = 0;
        System.out.println("Escribe el total de número a procesar");
        total = sc.nextInt();
        
        for (c=1; c<=total; c++) {
            System.out.println("Escribe el número:"); 
            num = sc.nextInt();
            
            if ( num >=0){
                System.out.println("Número positivo");
                p++;
            }
            else {
                System.out.println("Número negativo");
                n++;
            }
        System.out.println("Hay " + p + " números positivos.");
        System.out.println("Hay " + n + " números positivos.");
        }
    }
}
