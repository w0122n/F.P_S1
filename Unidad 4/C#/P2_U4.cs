using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int[] calif = new int[10] { 80, 75, 95, 82, 66, 70, 45, 80, 69, 62 };
            /* double s, p; */
            double s = 0, p = 0;

            /* s = calif[0] + calif[1] + calif[2] + calif[3] + calif[4] + calif[5] + calif[6] + calif[7] + calif[8] + calif[9]; */
            for (int c = 0; c < 10; c++)
            {
                s = s + calif[c];
                p = s / 10;
                
            }
             Console.WriteLine("Tienes un promedio de " + p);
        }
    }
}