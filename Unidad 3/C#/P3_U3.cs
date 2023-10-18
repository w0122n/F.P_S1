using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Dia
    {
        static void Main(string[] args)
        {
            int dia;
            Console.WriteLine("Programa para los dias de la semana.");
            Console.WriteLine("Introdusca un número para saber que día es: ");
            dia = Convert.ToInt32(Console.ReadLine());
            switch (dia)
            {
                case 1:
                    Console.WriteLine("Es lunes");
                    break;
                case 2:
                    Console.WriteLine("Es martes");
                    break;
                case 3:
                    Console.WriteLine("Es miercoles");
                    break;
                case 4:
                    Console.WriteLine("Es jueves");
                    break;
                case 5:
                    Console.WriteLine("Es viernes");
                    break;
                case 6:
                    Console.WriteLine("Es sabado");
                    break;
                case 7:
                    Console.WriteLine("Es domingo");
                    break;
            }
        }
    }
}