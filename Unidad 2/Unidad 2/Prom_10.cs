using System;

namespace P_10 // Note: actual namespace depends on the project name.
{
    internal class Hexagono
    {
        static void Main(string[] args)
        {
            int L, P, A, área;
            Console.WriteLine("Introuzca valor de uno de los lados");
            L = Convert.ToInt32(Console.ReadLine());
            P = L * 6;
            Console.WriteLine("Introducir valor de la apotema");
            A = Convert.ToInt32(Console.ReadLine());
            área = (P * A) / 2;
            Console.WriteLine("El área es igual a :" + área);
        }
    }
}