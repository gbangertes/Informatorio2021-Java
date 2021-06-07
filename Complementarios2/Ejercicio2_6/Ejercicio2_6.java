import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio2_6 {
  // Se dispone de una lista de Empleados, de cada empleado se conoce:
  // Nombre y Apellido
  // DNI
  // horasTrabajadas
  // valorPorHora
  // Todos los empleados están cargados en un Set (HashSet), se desea calcular
  // el valor sueldo (horasTrabajadas por valorPorHora) de toda esa lista para
  // luego almacenar en un Map (o un Diccionario) donde la clave (key) es el dni
  // y el valor (value) es el sueldo calculado.

  public static void main(String[] args) {
	HashSet<Empleado> listaEmpleados = new HashSet<Empleado>();
	HashMap<Integer, Integer> sueldosEmpleados = new HashMap<Integer, Integer>();
	cargarEmpleados(listaEmpleados);
	sueldosEmpleados = calcularSueldos(listaEmpleados);
	System.out.println(listaEmpleados);
	System.out.println(sueldosEmpleados);
  }

  public static void cargarEmpleados(HashSet<Empleado> listaEmpleados) {
	for (int i = 1; i < 11; i++) {
	  listaEmpleados.add(new Empleado("Jane Doe " + i, 30000000 + i, 20 + i, 500 + i));
	}
  }

  public static HashMap<Integer, Integer> calcularSueldos(HashSet<Empleado> listaEmpleados) {
	HashMap<Integer, Integer> sueldosEmpleados = new HashMap<Integer, Integer>();
	for (Empleado elemento : listaEmpleados) {
	  sueldosEmpleados.put(elemento.getDni(),
						   (elemento.getHorasTrabajadas() * elemento.getValorPorHora()));
	}
	return sueldosEmpleados;
  }
}
