import java.util.Scanner;

public class Ejercicio1_4 {
  //Realizar un programa que calcule el factorial de un número.
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese un número:");
	int nro = scan.nextInt();
	scan.close();
	int factorial = 1;
	for (int i = 1; i < nro + 1; i++) {
	  factorial *= i;
	}
	System.out.println("El factorial de " + nro + " es: " + factorial);
  }
}
