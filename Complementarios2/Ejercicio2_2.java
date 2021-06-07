import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2_2 {
  // Crear un ArrayList, agregar 5 números enteros. Luego agregar un número
  // entero al principio de la lista y otro al final. Por último, iterar e
  // imprimir los elementos de la lista y el tamaño de la misma (antes y después
  // de agregar en la primera y última posición).

  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> numeros = cargarLista(scan);
	mostrarLista(numeros);
	System.out.println("Ingresar un número al principio de la lista:");
	int nro = scan.nextInt();
	numeros.add(0, nro);
	mostrarLista(numeros);
	System.out.println("Ingresar un número al final de la lista:");
	numeros.add(scan.nextInt());
	mostrarLista(numeros);
	scan.close();
  }

  public static ArrayList<Integer> cargarLista(Scanner scan) {
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	System.out.println("Ingrese cinco números enteros:");
	for (int i = 0; i < 5; i++) {
	  numeros.add(scan.nextInt());
	}
	return numeros;
  }

  public static void mostrarLista(ArrayList<Integer> numeros) {
	System.out.println("Los números ingresados son:");
	for (Integer elemento : numeros) {
	  System.out.println(elemento);
	}
	System.out.println(String.format("El tamaño de la lista es: %d", numeros.size()));
  }
}
