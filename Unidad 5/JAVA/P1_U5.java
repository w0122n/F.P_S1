/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1_u5;

/**
 *
 * @author LaboratorioLTI2
 */
public class P1_U5 {

    public static void main(String[] args) {
         System.out.println ("La suma es " + suma (7, 8));
    System.out.println ("La resta es " + resta (9, 8));
    System.out.println ("La multiplicacion es " + multi (5, 8));
    System.out.println ("La division es " + div (16, 8));
  }
  public static int suma (int a, int b)
  {
    int s = a + b;
    return s;
  }
  public static int resta (int a, int b)
  {
    int r = a - b;
    return r;
  }
  public static int multi (int a, int b)
  {
    int m = a * b;
    return m;
  }
  public static int div (int a, int b)
  {
    int d = a / b;
    return d;
  }
}