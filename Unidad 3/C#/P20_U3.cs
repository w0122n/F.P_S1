using System;

namespace MyApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int d = 1;
            double AD = 3, AA = 0;

            while (d <= 365)
            {
              Console.WriteLine("El dia " + d + "tuvo un ahorro de $" + AD);
                AA += AD;
                AD *= 3;
                d++;
            }

            Console.WriteLine("El ahorro total en un año es de $" + AA);
            
        }
    }
}