package ejercicio3;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] pers = new Persona[5];
		char opc ;
		char clie = 'c', emple = 'e';
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < pers.length; i++) {
			System.out.println("Ingrese C para cliente y E para empleado:");
			opc = teclado.next().charAt(0);
			if (clie == opc) {
				Cliente cli = new Cliente();
				cli.setnombre();
				cli.setapellido();
				cli.setdni();
				cli.setcuit();
				cli.setdireccion();
				pers[i]= cli;
			} else {
				if (emple == opc) {
					Empleado emp=new Empleado();
					emp.setnombre();
					emp.setapellido();
					emp.setdni();
					emp.setlegajo();
					emp.setpuesto();
					pers[i]=emp;
				} else {
					System.out.println("la letra ingresada no es correcta,empieze de nuevo");
				}

			}
		}
		teclado.close();
	
	for(int i=0; i<4; i++){
	//orders by DNI
	//NO PERDER
		for(int j=1; j<5; j++){
			if (pers[i].dni > pers[j].dni){
				Persona aux;
			
				aux = pers[i];
				pers[i] = pers[j];
				pers[j] = aux;
			}
				
		}
	}
	for(int i = 0; i<5; i++){
		System.out.println(pers[i].descGral());
	}
  }
}
