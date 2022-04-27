package packageGitWalid;

import java.util.Scanner;

public class MainEx {

	public static void altaTienda(Tienda tienda) {
		System.out.println("Hay " + tienda.getEmpleados() + " empleados");
		int EmpleadosSeccion = tienda.EmpleadosSeccion();
		if (EmpleadosSeccion < 10) {
			while (EmpleadosSeccion < 10) {
				System.out.println("Es necesario más empleados por sección en esta tienda, vamos a aumentarlos");
				tienda.setEmpleados(tienda.getEmpleados() + 10);
				EmpleadosSeccion = tienda.EmpleadosSeccion();
				System.out.println("Ahora los empleados por sección serán: " + EmpleadosSeccion);
			} 
		}
		
		System.out.println("Todo Ok, Tenemos " + tienda.EmpleadosSeccion() + " EmpleadosSeccion");

	}
	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int opcion=0, numSecciones;
		
		do {
			System.out.println("\n**********************************");
			System.out.println("¿Qué tipo de tienda quieres crear?");
			System.out.println("1=Hipermercado");
			System.out.println("2=Supermercado");	
			System.out.println("3=CiTy");
			opcion = datos.nextInt();
			if (opcion > 0 && opcion < 4) {
 			 System.out.println("¿Cuántas secciones quieres crear?");
			 numSecciones = datos.nextInt();
			 switch (opcion) {
			  case 1:
				Hipermercado hiper = new Hipermercado(numSecciones);
				MainEx.altaTienda(hiper);
				break;
			  case 2:
				Supermercado mercado = new Supermercado(numSecciones);
				MainEx.altaTienda(mercado);
				break;
			  case 3:
				City barrio = new City(numSecciones);
				MainEx.altaTienda(barrio);
				break;
			  default:
				System.out.println("Fin programa.");
				break;
			  } //switch
			 } //if
			} while (opcion>0 && opcion<4);	
		 System.out.println("Número de tiendas en el Sistema: "+Tienda.numeroTiendas);
		 System.out.println("El programa ha finalizado");
		 System.out.println("Walid");
		 
		 datos.close();
	 } //main
	

}
