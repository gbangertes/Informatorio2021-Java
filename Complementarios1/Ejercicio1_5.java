import java.util.Scanner;

public class Ejercicio1_5 {
  // Se desea una aplicación que solicite dos números y realice la operación de multiplicación por sumas sucesivas sin usar librerías.
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese dos números:");
	int a = scan.nextInt();
	int b = scan.nextInt();
	scan.close();
	int mult = 0;
	for (int i = 0; i < b; i++) {
	  mult += a;
	}
	System.out.println(a + " x " + b + " = " + mult);
  }
}
