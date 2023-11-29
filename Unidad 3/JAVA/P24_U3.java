/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p24_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P24_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n;
        
        do{
            
            System.out.println("Ingresa un número:");
        n=sc.nextInt();
            if (n%2==0){
                System.out.println("Número par");
            }
            else {
                System.out.println("Número impar");
            }   
        } while (n>0);
    }
}
