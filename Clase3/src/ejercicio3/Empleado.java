package ejercicio3;

import java.util.Scanner;

public class Empleado extends Persona {
	int legajo;
	String puesto;
	
	public String descGral(){
		return super.descGral()+" Legajo:"+this.legajo+" Puesto:"+this.puesto;
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
	
	public void setpuesto(){
		System.out.println("ingrese el puesto:");
		Scanner teclado = new Scanner(System.in);
		this.puesto = teclado.next();
		teclado.close();
	}
	public String getpuesto(){
		return puesto;
	}
	public void setlegajo(){
		System.out.println("ingrese el legajo:");
		Scanner teclado = new Scanner(System.in);
		this.legajo = Integer.parseInt(teclado.next());
		teclado.close();
	}
	public int getlegajo(){
		return legajo;
	}
}

