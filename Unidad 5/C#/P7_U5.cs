using System;

class P7_U5
{
    static void Main()
    {
        Console.WriteLine("Ingrese el subtotal de la factura:");
        double sub = double.Parse(Console.ReadLine());

        double iva = Calcular_IVA(sub);
        double total = Calcular_Total(sub, iva);

        Console.WriteLine($"Subtotal: ${sub}");
        Console.WriteLine($"IVA: ${iva}");
        Console.WriteLine($"Total: ${total}");
    }

    static double Calcular_IVA(double sub)
    {
        double porcentaje_IVA = 0.16;
        return sub * porcentaje_IVA;
    }

    static double Calcular_Total(double sub, double iva)
    {
        return sub + iva;
    }
}