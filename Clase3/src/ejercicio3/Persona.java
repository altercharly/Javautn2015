package ejercicio3;
import java.util.Scanner;
public class Persona {
	int dni;
	String nombre , apellido ;
	
	public String descGral(){
		return "Dni:"+this.dni+" Nombre:"+this.nombre+" Apellido:"+this.apellido;
	}
	
	public void setdni(){
		System.out.println("ingrese el dni:");
		Scanner teclado = new Scanner(System.in);
		this.dni = Integer.parseInt(teclado.next());
		teclado.close();
	}
	public void setnombre(){
		System.out.println("ingrese el nombre:");
		Scanner teclado = new Scanner(System.in);
		this.nombre = teclado.next();
		teclado.close();
	}
	public void setapellido(){
		System.out.println("ingrese el apellido:");
		Scanner teclado = new Scanner(System.in);
		this.apellido = teclado.next();
		teclado.close();
	}
	public int getdni(){
		return dni;
	}
	public String getnombre(){
		return nombre;
	}
	public String getapellido(){
		return apellido;
	}
}
