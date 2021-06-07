import java.util.Scanner;

public class Ejercicio1_1 {
  // Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje "Hola {USUARIO}!!!"
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Por favor ingrese su nombre: ");
	String nombre = scan.nextLine();
	System.out.println("Hola " + nombre + "!!!");
	scan.close();
  }
}
