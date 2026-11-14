package ejemplos;

public class Seleccion {
	
		private void swap(String[]datos, int i, int j) {
			if(i==j)
				return;
			String si = datos[i];
			String sj = datos[j];
			datos[i] = sj;
			datos[j] = si;
	    }
		private int minimo (String[]datos, int a, int z) {
			int min = a;
			for(int i = a; i<z; i++) 
				if(datos[i].compareTo(datos[min]) < 0)
					min = i;
			return min;
			
		}
		public void sort(String[]datos) {
			for(int i = 0;i<datos.length-1;i++) {
				int j = minimo(datos,i,datos.length);
				swap(datos,i,j);
			}
			
		}

}
