using System;

namespace MyApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i;
            double si = 1500, a = 1, sa = 1;
            for (i = 1; i <= 6; i++)
            {
                Console.WriteLine("Su sueldo este años es de $" + si);
                a = si * 0.10;
                si = si + a;
            }
            sa = sa + si;
            Console.WriteLine("Su sueldo por estos 6 años es de $" + sa);
        }
    }
}