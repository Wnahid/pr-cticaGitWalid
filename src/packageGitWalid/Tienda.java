package packageGitWalid;

public abstract class Tienda {
    int empleados = 50;
    int metros2 = 200;
    public static int numeroTiendas = 0;
    
    
    public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public int getMetros2() {
		return metros2;
	}

	public void setMetros2(int met2) {
		this.metros2 += met2;
	}
	
	public abstract int EmpleadosSeccion ();
}


