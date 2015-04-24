package ejercicio3;
import java.util.Scanner;
public class Cliente extends Persona {
	int cuit;
	String direccion;
	
	public String descGral(){
		return super.descGral()+" Cuit:"+this.cuit+" Direccion:"+this.direccion;
	}
	
	public void setdni(){
		super.setdni();
	}
	public void setnombre(){
		super.setnombre();
	}
	public void setapellido(){
		super.setapellido();
	}
		
	public void setdireccion(){
		System.out.println("ingrese el direccion:");
		Scanner teclado = new Scanner(System.in);
		this.direccion = teclado.next();
		teclado.close();
	}
	public void getdireccion(){
		System.out.println(this.direccion);
	}
	public void setcuit(){
		System.out.println("ingrese el cuit:");
		Scanner teclado = new Scanner(System.in);
		this.cuit = Integer.parseInt(teclado.next());
		teclado.close();
	}
	public void getcuit(){
		System.out.println(this.cuit);
	}
}
