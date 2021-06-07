import java.util.Scanner;

public class Ejercicio1_8 {
  // Crear una aplicación que solicite de entrada los datos de una persona:
  // Nombre y Apellido
  // Edad
  // Direccion
  // Ciudad
  // Luego imprima: {Ciudad} - {Direccion}....

  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese su nombre y apellido:");
	String nombre = scan.nextLine();
	System.out.println("Ingrese su edad:");
	int edad = scan.nextInt();
	scan.nextLine();
	System.out.println("Ingrese su direccion:");
	String direccion = scan.nextLine();
	System.out.println("Ingrese su ciudad:");
	String ciudad = scan.nextLine();
	scan.close();
	System.out.println(String.format("%s - %s - %d - %s",
									  ciudad, direccion, edad, nombre));
  }
}

