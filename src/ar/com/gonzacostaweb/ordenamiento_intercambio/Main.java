package ar.com.gonzacostaweb.ordenamiento_intercambio;

public class Main {
	
	public static void main (String[] args) {
		
		String[] nombres = {"Fernando", "Facundo", "Lourdes", "Tomás", "Micaela"};
		
		// Se recorre hasta -1 ya que la última posición no va a tener que compararse con ninguna otra.
		
		for(int i = 0; i < (nombres.length - 1); i++) {
			
			// Se empieza a recorrer en +1 ya que queremos comparar el valor en i con todos los que le siguen.
			
			for(int j = i+1; j < nombres.length; j++) {
				
				if(nombres[i].compareToIgnoreCase(nombres[j])  > 0) {
					
					String aux = nombres[i];
					
					nombres[i] = nombres[j];
					
					nombres[j] = aux;
					
				}
				
			}
			
		}
		
	   // Se muestra el array ordenado
			
	   for(String n: nombres) {
				
				System.out.println(n + "\n");
				
	   }		
		
	}

}
