import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2_3 {
  // Crear una lista que contenga como elementos la numeración de cartas de una
  // baraja francesa (solo los valores, no figuras). Se deberá cargar el
  // ArrayList (en oden), imprimir, imprimir en orden inverso (reverse),
  // desordenar (mezclar) el ArrayList y volver a imprimir.

  public static void main(String[] args) {
	ArrayList<Integer> baraja = new ArrayList<Integer>();
	baraja = cargarLista(baraja);
	System.out.println("Cargando baraja...");
	mostrarLista(baraja);
	baraja = invertirLista(baraja);
	System.out.println("Invirtiendo orden...");
	mostrarLista(baraja);
	baraja = mezclarLista(baraja);
	System.out.println("Mezclando...");
	mostrarLista(baraja);
  }

  public static ArrayList<Integer> cargarLista(ArrayList<Integer> baraja) {
	for (int i = 1; i < 16; i++) {
	  baraja.add(i);
	}
	return baraja;
  }

  public static ArrayList<Integer> mezclarLista(ArrayList<Integer> baraja) {
	Collections.shuffle(baraja);
	return baraja;
  }

  public static ArrayList<Integer> invertirLista(ArrayList<Integer> baraja) {
	Collections.reverse(baraja);
	return baraja;
  }

  public static void mostrarLista(ArrayList<Integer> baraja) {
	for (Integer elemento : baraja) {
	  System.out.println(elemento);
	}
  }
}
