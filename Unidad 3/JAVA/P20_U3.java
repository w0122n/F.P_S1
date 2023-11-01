/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p20_u3;

/**
 *
 * @author hannm
 */
public class P20_U3 {

    public static void main(String[] args) {
        {
            int d = 1;
            double AD = 3, AA = 0;

            while (d <= 365)
            {
              System.out.println("El dia " + d + "tuvo un ahorro de $" + AD);
                AA += AD;
                AD *= 3;
                d++;
            }

            System.out.println("El ahorro total en un año es de $" + AA);
            
        }
    }
}