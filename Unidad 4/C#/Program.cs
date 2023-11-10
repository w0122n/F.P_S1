using System;

namespace MyApp
{
    internal class Negativo
    {
        static void Main(string[] args)
        {

            int n=0, total=0, num;
            Console.WriteLine("Ingresa los números a procesar");
            num = Convert.ToInt32(Console.ReadLine());

            int[] neg = new int[num];

            for (int ne = 0; ne < neg.Length; ne++)
            {
                Console.WriteLine("Ingrese número negativo");
                neg[ne] = Convert.ToInt32(Console.ReadLine());

            }
            Console.WriteLine("Hayn un total de ");
        }
    }
}