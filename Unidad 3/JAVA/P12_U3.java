/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p12_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P12_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int c, total, num;
        System.out.println("Escribe el total de número a procesar");
        total = sc.nextInt();
        
        for (c=1; c<=total; c++) {
            System.out.println("Escribe el número:"); 
            num = sc.nextInt();
            
            if ( num %2 ==0){
                System.out.println("Número PAR");
            }
            else {
                System.out.println("Número IMPAR");
            }
        }
        
    }
}
