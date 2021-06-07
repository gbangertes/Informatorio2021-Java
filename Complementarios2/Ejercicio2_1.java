import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2_1 {
  // Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
  // luego imprimir por pantalla el ranking

  public static void main(String[] args) {
	ArrayList<String> ciudades = cargarLista();
	mostrarRanking(ciudades);
  }

  public static ArrayList<String> cargarLista() {
	ArrayList<String> ciudades = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	int otra = 1;
	do {
	  System.out.println("Ingrese una ciudad:");
	  ciudades.add(scan.nextLine());
	  do {
		System.out.println("Desea cargar otra ciudad?\n1 - Sí\n2 - No");
		otra = scan.nextInt();
		scan.nextLine();
	  } while(otra != 1 && otra != 2);
	} while(otra == 1);
	return ciudades;
  }

  public static void mostrarRanking(ArrayList<String> ciudades) {
	for (int i = 0; i < ciudades.size(); i++) {
	  System.out.println(String.format("#%d - %s", i + 1, ciudades.get(i)));
	}
  }
}
