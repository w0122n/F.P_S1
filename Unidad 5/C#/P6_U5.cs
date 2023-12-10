using System;

class P6_U5
{
    static void Main()
    {
        Console.WriteLine("Ingrese la longitud de secuencia Fibonacci:");
        int longitud = int.Parse(Console.ReadLine());

        Console.WriteLine("Secuencia Fibonacci:");
        imp_Fibonacci(longitud);
    }

    static void imp_Fibonacci(int longitud)
    {
        int primer_num = 0;
        int segundo_num = 1;

        Console.Write(primer_num + " " + segundo_num + " ");

        for (int i = 2; i < longitud; i++)
        {
            int siguiente_num = primer_num + segundo_num;
            Console.Write(siguiente_num + " ");

            primer_num = segundo_num;
            segundo_num = siguiente_num;
        }
    }
}