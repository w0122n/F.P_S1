using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num, cb;
            do
            {
                Console.WriteLine("Ingresa un número: ");
                num = Convert.ToInt32(Console.ReadLine());
                cb = num * num * num;
                Console.WriteLine("El cubo de " + num + " es: " + cb);

            } while (num > 0);
        }
    }
}