using System;

namespace MyApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c, total, num;
            Console.WriteLine("Escribe el total de número a procesar");
            total = Convert.ToInt32(Console.ReadLine());

            for (c = 1; c <= total; c++)
            {
                Console.WriteLine("Escribe el número:");
                num = Convert.ToInt32(Console.ReadLine());

                if (num % 2 == 0)
                {
                    Console.WriteLine("Número PAR");
                }
                else
                {
                    Console.WriteLine("Número IMPAR");
                }
            }
        }
    }
}