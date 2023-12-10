import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
       System.out.println("Ingrse un numero");
        int numero = sc.nextInt();

        if (es_Primo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean es_Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}