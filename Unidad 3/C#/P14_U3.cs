using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c;
            for (c = 1; c <= 200; c++)
            {
                if (c % 2 == 0)
                {
                    Console.WriteLine(c);
                }
            }

        }
    }
}