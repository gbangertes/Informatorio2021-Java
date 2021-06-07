import java.util.Scanner;

public class Ejercicio1_3 {
  //Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1).
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese un número:");
	int nro = scan.nextInt();
	for (int i = 1; i < nro + 1; i++) {
	  for (int j = 1; j < i + 1; j++) {
		System.out.print(j);
		if (j != i) {
		  System.out.print(" ");
		}
	  }
	  System.out.println();
	}
	scan.close();
  }
}
