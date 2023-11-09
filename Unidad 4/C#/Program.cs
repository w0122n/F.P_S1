using System;

namespace MyApp 
{
    internal class Promedio
    {
        static void Main(string[] args)
        {

            int[] calif = new int[10] // { 90, 83, 75, 62, 91, 80, 66, 90, 79, 87 };

            double sum = 0, prom = 0;

            for (int c = 0; c < 10; c++)
            {
                sum = sum + calif[c];
                prom = sum / 10;
                
            }
             Console.WriteLine("Tu promedio es " + prom);
        }
    }
}