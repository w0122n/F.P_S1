using System;

namespace MyApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] num = { { 21, 5, 21 }, { 25, 3, 18 }, { 22, 1, 6 } };

            for (int i = 0; i <=2; i++)
            {
                for (int c = 0; c <=2; c++)
                {
                    Console.Write(num[i,c] + " ");
                }
                Console.WriteLine();
            }

            /*Console.Write(num[0, 0]);
            Console.Write(num[0, 1]);
            Console.Write(num[0, 2]);
            Console.WriteLine();
            Console.Write(num[1, 0]);
            Console.Write(num[1, 1]);
            Console.Write(num[1, 2]);
            Console.WriteLine();
            Console.Write(num[2, 0]);
            Console.Write(num[2, 1]);
            Console.Write(num[2, 2]);*/
        }
    }
}