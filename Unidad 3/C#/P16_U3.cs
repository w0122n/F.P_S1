using System;

namespace MyApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c = 1, hrs, pago, sueldo;

            while (c <= 20)
            {
                Console.WriteLine("¿Cuantas horas trabajaste?");
                hrs = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Ingresa el pago");
                pago = Convert.ToInt32(Console.ReadLine());

                sueldo = pago * hrs;
                Console.WriteLine("Su sueldo es " + sueldo);
                c++;
            }
        }
    }
}