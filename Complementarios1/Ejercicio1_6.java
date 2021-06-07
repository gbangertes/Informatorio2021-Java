import java.util.Scanner;

public class Ejercicio1_6 {
  // Se desea una aplicación que solicite dos números y realice la operación de potencia sin usar librerías.
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese dos números enteros:");
	int a = scan.nextInt();
	int b = scan.nextInt();
	scan.close();
	int pot = a;
	for (int i = 1; i < b; i++) {
	  pot *= a;
	}
	System.out.println(a + " elevado a " + b + " = " + pot);
  }
}
