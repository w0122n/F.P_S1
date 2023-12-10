import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	    
	   System.out.println("Ingrese una frase o una palabra:");
        String entrada_Usuario = sc.nextLine();

        int cantidad_Palabras = contar_Palabras(entrada_Usuario);

        System.out.println("Número de palabras: " + cantidad_Palabras);
    }

    public static int contar_Palabras(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return 0;
        }

        String[] palabras = cadena.split("\\s+");

        return palabras.length;
    }
}
