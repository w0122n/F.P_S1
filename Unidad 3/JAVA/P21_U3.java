/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p21_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P21_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        int num, cb;
        
        do{
            System.out.println("Ingresa un número: ");
            num = sc.nextInt();
            cb = num * num * num;
                System.out.println("El cubo de " + num + " es: " + cb);
            
        } while (num > 0);  
    }
}
