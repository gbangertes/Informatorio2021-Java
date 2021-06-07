import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2_7 {
  public static void main(String[] args){
	ArrayList<String> fizzBuzz = new ArrayList<String>();
	System.out.println("Ingrese dos números, el primero menor al segundo.");
	Scanner scan = new Scanner(System.in);
	int menor = scan.nextInt();
	int mayor = scan.nextInt();
	fizzBuzz = fizzBuzzFuncion(menor, mayor);
	System.out.println(fizzBuzz);
  }

  public static ArrayList<String> fizzBuzzFuncion(int menor, int mayor) {
	ArrayList<String> fizzBuzz = new ArrayList<String>();
	if (menor < mayor) {
	  String elemento;
	  for (int i = menor; i < mayor; i++) {
		elemento = (i % 2 == 0 && i % 3 == 0)
		  ? "FizzBuzz"
		  : (i % 3 == 0)
		  ? "Buzz"
		  : (i % 2 == 0)
		  ? "Fizz"
		  : String.valueOf(i);
		fizzBuzz.add(elemento);
	  }
	} else System.out.println("El primer argumento debe ser menor al segundo.");
	return fizzBuzz;
  }
}
