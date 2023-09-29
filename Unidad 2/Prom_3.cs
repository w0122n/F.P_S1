using System;

namespace P_3 // Note: actual namespace depends on the project name.
{
    internal class Promedio
    {
        static void Main(string[] args)
        {
            int c1, c2, c3, c4, c5, c6;
            float promedio;
            Console.WriteLine("Escribe Calificación 1: " );
            c1 = Convert.ToInt32( Console.ReadLine() );
            Console.WriteLine("Escribe Calificación 2: ");
            c2 = Convert.ToInt32( Console.ReadLine() );
            Console.WriteLine("Escribe Calificación 3: ");
            c3 = Convert.ToInt32( Console.ReadLine() );
            Console.WriteLine("Escribe Calificación 4: ");
            c4 = Convert.ToInt32( Console.ReadLine() );
            Console.WriteLine("Escribe Calificación 5: ");
            c5 = Convert.ToInt32( Console.ReadLine() );
            Console.WriteLine("Escribe Calificación 6: ");
            c6 = Convert.ToInt32( Console.ReadLine() );
            //Paso - calcular promedio
            promedio = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
            //paso - Imprimir promedio
            Console.WriteLine("Tu promedio es :" + promedio);
        }
    }
}