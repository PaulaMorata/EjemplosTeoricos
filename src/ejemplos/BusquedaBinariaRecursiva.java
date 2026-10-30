package ejemplos;

public class BusquedaBinariaRecursiva {
	
	private String[] claves;
	
	public BusquedaBinariaRecursiva(String[]claves) {
		this.claves = claves;
	}
	
	
	//método fachada del de abajo
	public int busca(String clave) {
		return busca(clave, 0, claves.length);
	}
	
	private int busca(String clave, int a, int z) {
		if(a==z)
			return -1;
		int m = (a+z)/2;
		int cmp = claves[m].compareTo(clave);
		if(cmp==0)
			return m;		
		if(cmp<0)
			return busca(clave,m+1,z);
		else
			return busca(clave,a,m);	    
	
	
	}
	
}
