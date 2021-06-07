import java.util.Scanner;

public class Ejercicio1_9 {
  // Dado un String de entrada calcular la cantidad de veces que aparece una letra dada

  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese una frase:");
	String cadena = (scan.nextLine()).toLowerCase();
	System.out.println("Ingrese una letra:");
	char caracter = (scan.nextLine()).charAt(0);
	scan.close();
	System.out.print("La cantidad de ocurrencias del caracter es: ");
	System.out.println(contarCaracter(cadena, caracter));
  }

  public static int contarCaracter(String cadena, char caracter) {
	int contador = 0;
	for (char elemento : cadena.toCharArray()) {
	  if (elemento == caracter) contador += 1;
	}
	return contador;
  }
}
