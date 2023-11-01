/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p17_u3;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P17_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char opcion;
        
        do{
            System.out.println("¡Bienvenido a una sala ejecución!");
            System.out.println("¡¡¡Escribe n para salir!!!");
            opcion=sc.next().charAt(0);
            
        } while (opcion != 'n');
        
    }
}
