package ejercicio2;

import java.util.Scanner;

public class Vectnummay {
	int[] numeros = new int [20], numeros2 = new int [20];
	int primero;
	
	public void cargar()
	{
		Scanner teclados;
		teclados = new Scanner(System.in);

		System.out.println("ingrese el valor con el cual comparar:");
		this.primero = teclados.nextInt(); 
		for (int m = 0; m < 20; m++)
		{
			this.numeros2[m]=-666;
		}
		for (int f = 0; f < this.numeros.length; f++) 
		{
			System.out.println("Ingrese el valor del numero:");
			this.numeros[f] = teclados.nextInt();
			if (this.primero < this.numeros[f]) 
			{
				this.numeros2[f] = this.numeros[f];
			}
		}
		teclados.close();
	}
	public void imprimir(){
		System.out.println("Se mostraran los numeros mayores al valor ingresado inicialmente");
		for (int i = 0; i < this.numeros2.length; i++) {
			if (this.numeros2[i]!=-666)
			{
			System.out.println(this.numeros2[i]);
			}
		}
		System.out.println("el valor ingresado es:" + this.primero);
	}
}