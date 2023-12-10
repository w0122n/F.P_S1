import java.util.Scanner;
public class P7_U5
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	    
        System.out.println("Ingrese el subtotal de la factura:");
        double sub = sc.nextDouble();

        double iva = calcular_IVA(sub);
        double total = calcular_Total(sub, iva);

        System.out.println("Subtotal: $" + sub);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);
    }
    public static double calcular_IVA(double sub) {
        double porcentaje_IVA = 0.16;
        return sub * porcentaje_IVA;
    }

    public static double calcular_Total(double sub, double iva) {
        return sub + iva;
    }
}