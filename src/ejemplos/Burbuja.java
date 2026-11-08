package ejemplos;

public class Burbuja {
	//EJEMPLO DE IMPLEMENTACIÓN DEL ALGORITMO DE ORDENACIÓN DE LA BURBUJA
		private void swap(String[]datos, int i, int j) {
			if(i==j)
				return;
			String si = datos[i];
			String sj = datos[j];
			datos[i] = sj;
			datos[j] = si;
	    }
		public void sort(String[]datos) {
			boolean changed = false;;
			do {
				changed = false;
				for(int i = 0; i<datos.length-1; i++) {
					if(datos[i].compareTo(datos[i+1]) > 0) {
						swap(datos,i,i+1);
						changed = true;
					}
				}
			} while(changed);
		}	
}
