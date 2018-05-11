package examen;

import java.io.FileNotFoundException;
import java.io.IOException;

public class VerGeneros extends Leer {
	
	public VerGeneros(String FILENAME) throws FileNotFoundException, IOException {
		super(FILENAME);
		getGeneros(FILENAME);
		
	 	String[] output = getGeneros(FILENAME);
	 	printGeneros(output);
	}

	/**
	 * 
	 * @param FILENAME
	 * @return
	 * @throws FileNotFoundException
	 * utiliza método muestraContenido de clase Leer
	 */
	public String[] getGeneros(String FILENAME) throws FileNotFoundException{
		String[] output = Leer.muestraContenido(FILENAME);
		return output;
	}
	
	/**
	 * 
	 * @param lines
	 * imprime el resultado obtenido de la lectura
	 */
	public void printGeneros(String[] output) {
		if ( output[0] != "e" ) {
			System.out.println("Los genéros disponibles son los siguientes:");
			
			for (int i = 0; output.length > i ; i++) {   
		 		   System.out.println(output[i]);
		 	}
		} else {
			System.out.println("No hay géneros en el catálogo!");
		}
	}

}
