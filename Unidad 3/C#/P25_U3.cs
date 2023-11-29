using System;

namespace P25_U3 // Note: actual namespace depends on the project name.
{
    internal class Calculadora
    {
        static void Main(string[] args)
        {
            char operador;
            double N1, N2, r;

            do
            {
                Console.WriteLine("Ingrese un operador (+, -, *, /) o 'q' para salir:");
                operador = Console.ReadKey().KeyChar;

                if (operador != 'q')
                {
                    Console.WriteLine("Ingrese el 1er número:");
                    N1 = Convert.ToDouble(Console.ReadLine());

                    Console.WriteLine("Ingrese el 2do número:");
                    N2 = Convert.ToDouble(Console.ReadLine());  

                    switch (operador)
                    {
                        case '+':
                            r = N1 + N2;
                            break;
                        case '-':
                            r = N1 - N2;
                            break;
                        case '*':
                            r = N1 * N2;
                            break;
                        case '/':
                            r = N1 / N2;
                            break;
                        default:
                            Console.WriteLine("Operador no válido. Inténtea nuevamente.");
                            continue;
                    }

                    Console.WriteLine("El resultado es: " + r);
                }

            } while (operador != 'q');

        }
    }
}