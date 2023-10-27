/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p16_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P16_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int c=1, hrs, pago, sueldo;
         
        while (c<=2){
            System.out.println("¿Cuantas horas trabajaste?");
            hrs = sc.nextInt();
            System.out.println("Ingresa el pago");
            pago = sc.nextInt();
            
            sueldo = pago * hrs;
            System.out.println("Su sueldo es " + sueldo);
            c++;
        }
        
    }
}
