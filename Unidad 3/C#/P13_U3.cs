using System;

namespace MyApp 
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c, total, num, n = 0, p = 0;
            Console.WriteLine("Escribe el total de número a procesar");
            total = Convert.ToInt32(Console.ReadLine());

            for (c = 1; c <= total; c++)
            {
                Console.WriteLine("Escribe el número:");
                num = Convert.ToInt32(Console.ReadLine());

                if (num >= 0)
                {
                    Console.WriteLine("Número positivo");
                    p++;
                }
                else
                {
                    Console.WriteLine("Número negativo");
                    n++;
                }
                Console.WriteLine("Hay " + p + " números positivos.");
                Console.WriteLine("Hay " + n + " números positivos.");
            }
        }
    }
}