using System;

class P8_U5
{
    static void Main()
    {
        int num_dad = 2; 
        int resultado = Lanzar_dad(num_dad);

        Console.WriteLine("Resultado del lanzamiento: " + r);
    }

    static int Lanzar_dad(int num_dad)
    {
        Random random = new Random();
        int r = 0;

        for (int i = 0; i < num_dad; i++)
        {
            int valor_dad = random.Next(1, 7);
            Console.WriteLine($"Dado {i + 1}: {valor_dad}");

            r += valor_dad;
        }

        return r;
    }
}