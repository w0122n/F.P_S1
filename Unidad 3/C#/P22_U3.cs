using System;

namespace P22_U3 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i = 0, num, s = 0;

            do
            {
                Console.WriteLine("Ingrese un valor: (Ingrese 0 para terminar)");
                num = Convert.ToInt32(Console.ReadLine());
                s = s + num;
                Console.WriteLine(s);

            } while (num != 0);
        }
    }
}