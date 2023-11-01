using System;

namespace MyApp 
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c;
            for (c = 1; c <= 100; c++)
            {
                Console.WriteLine(c);
            }

            for (int i = 100; i > 1; i--)
            {
                Console.WriteLine(i);
            }
        }
    }
}