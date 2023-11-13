using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int f;

            Console.WriteLine("Ingrese las frutas a procesar: ");
            f = Convert.ToInt32(Console.ReadLine());

            int[] frutas = new int[f];

            for (int i = 0; i < frutas.Length; i++)
            {
                Console.WriteLine("Escribe una fruta en indice " + i + ": ");
                frutas[i] = Convert.ToInt32(Console.ReadLine());
            }

            Console.WriteLine("El orden de las frutas es: ");
            int o = f;
            while (o >= 0)
            {
                Console.WriteLine("La fruta en indice " + frutas[o] + " es: " + frutas);
                o--;
            }

        }
    }
}