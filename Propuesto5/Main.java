import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        // Leer archivo
        String path = "empleados.txt";
        cargarLista(listaEmpleados, path);

        // Ordenar por nombre completo y listar
        System.out.println("\n--- ORDENADO POR APELLIDO Y NOMBRE ---\n");
        listarEmpleados(listaEmpleados, Empleado.ordenarPorNombre);

        // Ordenar por sueldo ascendente
        System.out.println("\n--- ORDENADO POR SUELDO ASCENDENTE ---\n");
        listarEmpleados(listaEmpleados, Empleado.ordenarPorSueldoAsc);

        // Ordenar por sueldo descentende
        System.out.println("\n--- ORDENADO POR SUELDO DESCENDENTE ---\n");
        listarEmpleados(listaEmpleados, Empleado.ordenarPorSueldoDes);

        // Empleado con mayor edad
        System.out.println("\n--- EL EMPLEADO CON MAYOR EDAD ---\n");
        System.out.println(listaEmpleados.stream().max(Empleado.ordenarPorFechaNacimientoDes).get());

        // Empleado con menor edad
        System.out.println("\n--- EL EMPLEADO CON MENOR EDAD ---\n");
        System.out.println(listaEmpleados.stream().min(Empleado.ordenarPorFechaNacimientoDes).get());

        // Empleados con apellido con la letra dada
        Scanner scan = new Scanner(System.in);
        System.out.println("\nFiltrar por inicial del apellido. Ingrese una letra: ");
        char letra = scan.nextLine().charAt(0);
        scan.close();
        listarEmpleadosConInicial(listaEmpleados, letra);
    }

    public static void listarEmpleadosConInicial(ArrayList<Empleado> listaEmpleados, char letra) {
        letra = Character.toLowerCase(letra);
        System.out.println("\n--- EMPLEADOS CUYO APELLIDO COMIENZA CON LA LETRA: '"
                            + Character.toUpperCase(letra) + "' ---\n");
        for (Empleado empleado : listaEmpleados) {
            // Se muestra solo si el primer caracter del apellido coincide con "letra".
            if (Character.toLowerCase(empleado.getApellido().charAt(0)) == letra) {
                System.out.println(empleado.toString());
            }
        }
    }

    public static void cargarLista(ArrayList<Empleado> listaEmpleados, String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String[] arregloAtributosString;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                // Leer una linea y convertirla a arreglo
                arregloAtributosString = line.split(",");
                // Cargar lista de empleados
                listaEmpleados.add(new Empleado(arregloAtributosString[0],
                                                arregloAtributosString[1],
                                                LocalDate.parse(arregloAtributosString[2], formatter),
                                                Float.valueOf(arregloAtributosString[3])
                                                ));
                line = br.readLine();
            }
        }
    }

    public static void listarEmpleados(ArrayList<Empleado> listaEmpleados,
                                Comparator<Empleado> comparador) {
        listaEmpleados.sort(comparador);
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.toString());
        }
    }

}
