/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p13_u4;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P13_U4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        float[][] temp = new float[5][7];
        float[][] faren = new float[5][7];
        
        for (int f=0;f<5;f++)
        {
            for(int c=0;c<7;c++)
            {
                System.out.println("Ingrese la temperatura " + f + " " + c + " ");
                temp [f][c]= sc.nextFloat();
                
                faren[f][c]= (temp[f][c]*9/5)+32;
                
                System.out.println("La temperatura en Farenheit es "+ faren[f][c]);
            }
            
        }
    }
}
