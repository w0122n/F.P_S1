import java.util.Scanner;
public class P6_U5
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	    
        System.out.println("Ingrese la longitud de secuencia Fibonacci:");
        int longitud = sc.nextInt();

        System.out.println("Secuencia Fibonacci:");
        imp_Fibonacci(longitud);
    }

    public static void imp_Fibonacci(int longitud) {
        int primer_num = 0;
        int segundo_num = 1;

        System.out.print(primer_num + " " + segundo_num + " ");

        for (int i = 2; i < longitud; i++) {
            int siguiente_num = primer_num + segundo_num;
            System.out.print(siguiente_num + " ");

            primer_num = segundo_num;
            segundo_num = siguiente_num;
        }
    }
}