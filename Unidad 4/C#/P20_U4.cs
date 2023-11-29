using System;
class P20_U4 {
  static void Main() {
            int[,] num = { { 8, 3 }, { 3, 4 } };
            int[,] res = new int[2, 2];

            for (int f = 0; f < 2; f++)
            {
                for (int c = 0; c < 2; c++)
                {
                    res[f, c] = num[f, c] * num[f, c];
                }
            }

            for (int f = 0; f < 2; f++)
            {
                for (int c = 0; c < 2; c++)
                {
                    Console.Write(res[f, c] + ", ");
                }
                Console.WriteLine();
            }
        }
    }