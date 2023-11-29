using System;

class Program
{
    static void Main()
    {
        double[] num = { 8, 8, 1, 4, 9, 3, };

        double media = C_Media(num);
        Console.WriteLine($"La media es: {media}");

        double mediana = C_Mediana(num);
        Console.WriteLine($"La mediana es: {mediana}");
    }

    static double C_Media(double[] array)
    {
        double s = 0;

        foreach (double nu in array)
        {
            s += nu;
        }

        return s / array.Length;
    }

    static double C_Mediana(double[] array)
    {
        Array.Sort(array);

        int n = array.Length;

        if (n % 2 == 0)
        {
            double elemento1 = array[(n / 2) - 1];
            double elemento2 = array[n / 2];
            return (elemento1 + elemento2) / 2;
        }
        else
        {
            return array[n / 2];
        }
    }
}


