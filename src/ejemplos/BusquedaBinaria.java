package ejemplos;

public class BusquedaBinaria {
	private String[] claves;
	public BusquedaBinaria(String[]claves) {
		this.claves = claves;
	}
	
	//Método fachada del de abajo:
	public int busca(String clave) {
		return busca(clave, 0, claves.length);
	}
	
	private int busca(String clave, int a, int z) {
		while(a<z) {
			int m = (a+z)/2;
			int cmp = claves[m].compareTo(clave);
			if(cmp==0)
				return m;
			else if(cmp<0)
				a=m+1;
			else
				z=m;
		}
		return -1;
	}
}
