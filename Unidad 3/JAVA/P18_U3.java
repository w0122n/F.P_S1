/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p18_u3;

/**
 *
 * @author hannm
 */
public class P18_U3 {

    public static void main(String[] args) {
        
        int i;
        double si = 1500, a = 1, sa = 1;
        for (i = 1; i <= 6; i++)
         {
          System.out.println("Su sueldo este años es de $" + si);
           a = si * 0.10;
           si = si + a;
         }
           sa = sa + si;
           System.out.println("Su sueldo por estos 6 años es de $" + sa);
    }
}
