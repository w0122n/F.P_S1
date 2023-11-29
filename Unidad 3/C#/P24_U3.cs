using System;

namespace P24_U3 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n;

            do
            {

                Console.WriteLine("Ingresa un número:");
                n = Convert.ToInt32(Console.ReadLine());
                if (n % 2 == 0)
                {
                    Console.WriteLine("Número par");
                }
                else
                {
                    Console.WriteLine("Número impar");
                }
            } while (n > 0);
        }
    }
}