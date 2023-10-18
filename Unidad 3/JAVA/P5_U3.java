/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p5_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P5_U3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double P1,P2,P3,Total;
        
        System.out.println("Ingresa el valor del primer precio.");
        P1=sc.nextDouble();
        System.out.println("Ingresa el valor del segundo precio.");
        P2=sc.nextDouble();
        System.out.println("Ingresa el valor del tercer precio.");
        P3=sc.nextDouble();
        
        Total=P1+P2+P3;
        
        if (Total>=1500)
        {
            Total=Total-(Total*0.3);
            System.out.println("El total es " + Total);
        }
        else if (Total<1500 && Total>=1000)
        {
            Total=Total-(Total*0.2);
            System.out.println("El total es " + Total);
        }
        else if (Total<1000 && Total>=700)
        {
            Total=Total-(Total*0.1);
            System.out.println("El total es " + Total);
        }
        else 
        {
            System.out.println("El total es " + Total); 
        }
    }
}
