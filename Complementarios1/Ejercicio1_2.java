import java.util.Scanner;

public class Ejercicio1_2 {
  //Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese dos números:");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("La suma de ambos números es: " + (a + b));
	System.out.println("La resta de ambos números es: " + (a - b));
	System.out.println("La multiplicación de ambos números es: " + (a * b));
	System.out.println("La división de ambos números es: " + (a / b));
	System.out.println("El módulo de ambos números es: " + (a % b));
	scan.close();
  }
}
