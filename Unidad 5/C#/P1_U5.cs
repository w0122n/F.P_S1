using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("La suma es " + suma(7, 8));
            Console.WriteLine("La resta es " + resta(9, 8));
            Console.WriteLine("La multiplicacion es " + multi(5, 8));
            Console.WriteLine("La division es " + div(16, 8));
        }
        public static int suma(int a, int b)
        {
            int s = a + b;
            return s;
        }
        public static int resta(int a, int b)
        {
            int r = a - b;
            return r;
        }
        public static int multi(int a, int b)
        {
            int m = a * b;
            return m;
        }
        public static int div(int a, int b)
        {
            int d = a / b;
            return d;
        }
    }
}