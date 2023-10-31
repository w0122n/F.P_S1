using System;

namespace MyApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c = 1, suma = 0;
            while (c <= 20)
            {
                suma = suma + c;
                Console.WriteLine("Suma = " + suma);
                c++;
            }

        }
    }
}