import java.util.Scanner;

public class Ejercicio1_7 {
  // Realizar un Programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().

  public static void main(String[] args) {
	System.out.println("Ingrese una frase:");
	Scanner scan = new Scanner(System.in);
	String cadena = scan.nextLine();
	scan.close();
	System.out.println(convertirMayuscula(cadena));
  }

  public static String convertirMayuscula(String cadena) {
	String mayuscula = "";
	for (int i = 0; i < cadena.length(); i++) {
	  char caracter = cadena.charAt(i);
	  int ascii = (int)caracter;
	  caracter = (ascii == 241)
		? (char)209
		: (ascii > 96 && ascii < 123)
		  ? (char)(ascii -= 32)
		  : (char)ascii;
	  mayuscula += caracter;
	}
	return mayuscula;
  }
}
