import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2_4 {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> estudiantes = new ArrayList<String>();
	estudiantes = cargarLista(scan, estudiantes);
	System.out.println("Lista cargada:");
	mostrarLista(estudiantes);
	ArrayList<List<String>> comisiones = new ArrayList<List<String>>();
	comisiones = dividirLista(estudiantes);
	System.out.println("Comisión 1:");
	mostrarLista(comisiones.get(0));
	System.out.println("Comisión 2:");
	mostrarLista(comisiones.get(1));
	System.out.println("Comisión 3:");
	mostrarLista(comisiones.get(2));
  }

  public static ArrayList<String> cargarLista(Scanner scan, ArrayList<String> estudiantes) {
	System.out.println("Ingrese los nombres de los estudiantes:");
	for (int i = 0; i < 12; i++) {
	  estudiantes.add(scan.nextLine());
	}
	return estudiantes;
  }

  public static void mostrarLista(List<String> estudiantes) {
	for (String elemento : estudiantes) {
	  System.out.println(elemento);
	}
  }

  public static ArrayList<List<String>> dividirLista(ArrayList<String> estudiantes) {
	ArrayList<List<String>> comisiones = new ArrayList<List<String>>();
	comisiones.add(estudiantes.subList(0, 4));
	comisiones.add(estudiantes.subList(4, 8));
	comisiones.add(estudiantes.subList(8, estudiantes.size()));
	return comisiones;
  }
}
