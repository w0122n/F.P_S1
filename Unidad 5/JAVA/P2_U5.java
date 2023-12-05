/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2_u5;
import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P2_U5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double x, y;
        System.out.println("Escribe el valor para x: ");
        x = sc.nextDouble();
        System.out.println("Escribe eñ valor ´para y: ");
        y = sc.nextDouble();
        System.out.println("Resultado de ecuacion1 = " + ecuacion1(x,y));
        System.out.println("Resultado de ecuacion2 = " + ecuacion2 (x,y));
    }
    
    public static double ecuacion1 (double x, double y)
            
    {
        double r;
        r = Math.pow(x, 2) + (2 * Math.pow(y, 4));
        return r;
    }
    
    public static double ecuacion2 (double x, double y)
    {
        double r;
        r = Math.sqrt( Math.pow (x, 4) + 5 * y);
        return r;
    }
}
