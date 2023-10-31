using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int N, c = 0, my = 0, mn = 0;
            double num;

            Console.WriteLine("Ingrese la cantidad de números a procesar: ");
            N = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < N; i++)
            {
                Console.WriteLine("Ingresa un número");
                num = Convert.ToInt32(Console.ReadLine());  
                if (num == 0)
                {
                    c++;
                }
                else if (num > 0)
                {
                    my++;
                }
                else
                {
                    mn++;
                }
            }
            Console.WriteLine("El total de números cero es: " + c);
            Console.WriteLine("El total de números mayores a cero es: " + my);
            Console.WriteLine("El total de números menores a cero es: " + mn);
        }
    }
}