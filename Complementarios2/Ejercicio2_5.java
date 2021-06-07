import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2_5 {
  // Dados 2 ArrayList que contienen horas-semanal de un empleado. Se debe generar
  // otra lista que contenga los totales y luego imprimir el total final a cobrar.

  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> hsTrabajadas = new ArrayList<Integer>();
	ArrayList<Integer> preciosHs = new ArrayList<Integer>();
	ArrayList<Integer> montosDiarios = new ArrayList<Integer>();
	Integer total = 0;
	cargarHs(scan, hsTrabajadas);
	cargarPrecios(scan, preciosHs);
	montosDiarios = calcularMontosDiarios(hsTrabajadas, preciosHs);
	total = calcularTotal(montosDiarios);
	System.out.println(montosDiarios);
	System.out.println(String.format("Total Final: $ %d", total));

  }

  public static void cargarHs(Scanner scan, ArrayList<Integer> hsTrabajadas) {
	System.out.println("Ingrese las horas trabajadas cada día de la semana:");
	for (int i = 0; i < 7; i++) {
	  hsTrabajadas.add(scan.nextInt());
	}
  }

  public static void cargarPrecios(Scanner scan, ArrayList<Integer> preciosHs) {
	System.out.println("Ingrese el precio de las horas trabajadas en la semana:");
	for (int i = 0; i < 7; i++) {
	  preciosHs.add(scan.nextInt());
	}
  }

  public static void mostrarLista(ArrayList<Object> lista) {
	for (Object i : lista) {
	  System.out.println(i);
	}
  }

  public static ArrayList<Integer> calcularMontosDiarios(ArrayList<Integer> hsTrabajadas,
													  ArrayList<Integer> preciosHs) {
	ArrayList<Integer> montosDiarios = new ArrayList<Integer>();
	for (int i = 0; i < 7; i++) {
	  montosDiarios.add(hsTrabajadas.get(i) * preciosHs.get(i));
	}
	return montosDiarios;
  }

  public static Integer calcularTotal(ArrayList<Integer> montosDiarios) {
	Integer total = 0;
	for (Integer i : montosDiarios) {
	  total += i;
	}
	return total;
  }
}
