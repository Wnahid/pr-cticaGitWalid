package packageGitWalid;

public final class Supermercado extends Tienda {
    int seccionesS;
    
    Supermercado(int seccsS){
    	this.seccionesS = seccsS;
    	numeroTiendas ++;
    }
    
    public int EmpleadosSeccion () {
    	int empleadosXsection =  (int) empleados/seccionesS;
    	System.out.println("Tienda tipo Supermercado. Empleados: " + empleados + " Secciones: " + seccionesS + " Empleados Por Seccion: " + empleadosXsection);
    	return empleadosXsection;
    }
}