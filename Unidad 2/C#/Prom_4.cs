using System;

namespace P_4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x, y, a;
            Console.WriteLine("Dar valor a Y");
            y = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Dar valor a A");
            a = Convert.ToInt32(Console.ReadLine());

            x = y + a + 3;
            Console.WriteLine("Tu resultado es :" + x);


        }
    }
}  