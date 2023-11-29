/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p22_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P22_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int i=0, num, s=0;
        
        do{
            System.out.println("Ingrese un valor: (Ingrese 0 para terminar)");
            num = sc.nextInt();
            s=s+num;
            System.out.println(s);
           
        } while(num!=0);
    }
}
