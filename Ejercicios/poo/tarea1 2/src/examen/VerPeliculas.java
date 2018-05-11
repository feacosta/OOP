package examen;

/**
 * 
 * @author felipefuller
 *
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


public class VerPeliculas extends Leer {

	/**
	 * 
	 * @param FILENAME
	 * @throws FileNotFoundException
	 * @throws IOException
	 * Llama método getPeliculas el cual utiliza métodos de leer
	 * 
	 */
	public VerPeliculas(String FILENAME) throws FileNotFoundException, IOException {
		super(FILENAME);
		
		getPeliculas(FILENAME);	
		List<List<String>> output = getPeliculas(FILENAME);
	 	
		printPeliculas(output);
	}
	
	public List<List<String>> getPeliculas(String FILENAME) throws FileNotFoundException {
		List<List<String>> output = Leer.getContenido(FILENAME);
		return output;
	}
	
	/**
	 * 
	 * @param lines
	 * imprime el resultado obtenido de la lectura
	 */
	public void printPeliculas(List<List<String>> lines) {
		if (lines.get(0).get(0) != "e") {
			System.out.println("Las películas disponibles son los siguientes:");
	
			// iterar sobre el arreglo 2D
		    int lineNo = 1;
		    for(List<String> line: lines) {
		        int columnNo = 1;
		        System.out.print(lineNo + ". ");
		        for (String value: line) {
		        	if (columnNo == 1 ){	        		
		        		System.out.print("Nombre: " + value + " ");
		        	}
		        	if (columnNo == 2 ){	        		
		        		System.out.print("Género: " + value + " ");
		        	}
		        	if (columnNo == 3 ){	        		
		        		System.out.print("Año: " + value + " ");
		        	}
		        	if (columnNo == 4 ){	        		
		        		System.out.print("Autor: " + value + " ");
		        	}
		        	if (columnNo == 5 ){	        		
		        		System.out.print("Idioma: " + value + " ");
		        	}
		        	if (columnNo == 6 ){	        		
		        		System.out.print("País: " + value + " ");
		        	}
		            columnNo++;
		        }
		        System.out.println("");
		        lineNo++;
		    }
		} else {
			System.out.println("No hay películas en el catálogo!");
		}
	}
}
