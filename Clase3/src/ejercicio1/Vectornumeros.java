package ejercicio1;
import java.util.Scanner;
public class Vectornumeros {
	private Scanner teclado;
	private int[] numeros;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		numeros = new int[15];
		for (int f = 0; f < numeros.length; f++) {
			System.out.println("Ingrese el valor del numero:");
			numeros[f] = teclado.nextInt();
		}
	}
	public void imprimir(){
		System.out.println("Se mostraran los numeros en ordenamiento inverso");
		for (int i = 14; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}
}
