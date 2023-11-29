using System;
class P19_U4 {
  static void Main() {
        int filas = 3;
        int columnas = 3;

        int[,] matriz = {
            {1, 2, 3},
            {6, 5, 4},
            {7, 8, 9}
        };

        Console.WriteLine("Matriz:");
        Mostrar_Ma(matriz);


        int pares = 0;
        int impares = 0;
        for (int i = 0; i < filas; i++)
        {
            for (int j = 0; j < columnas; j++)
            {
                if (matriz[i, j] % 2 == 0)
                {
                    pares++;
                }
                else
                {
                    impares++;
                }
            }
        }

     
        Console.WriteLine($"Cantidad de números pares: {pares}");
        Console.WriteLine($"Cantidad de números impares: {impares}");
    }

    static void Mostrar_Ma(int[,] matriz)
    {
        int filas = matriz.GetLength(0);
        int columnas = matriz.GetLength(1);

        for (int i = 0; i < filas; i++)
        {
            for (int j = 0; j < columnas; j++)
            {
                Console.Write(matriz[i, j] + "\t");
            }
            Console.WriteLine();
        }
    }
}