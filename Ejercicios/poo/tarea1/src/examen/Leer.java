package examen;

/**
 * 
 * @author felipefuller
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Leer {
	
    private static Scanner sc;

    public Leer(String FILENAME) throws FileNotFoundException, IOException
    {
    	getContenido(FILENAME);
    }
    
    /**
     * leer el archivo hasta llegar al final y 
     * ver cuantas lineas tiene para almacenarlas en 
     * un arreglo
     * se utiliza para la lectura de los géneros
     */
    
    public static String[] muestraContenido(String FILENAME) throws FileNotFoundException{
    	try{
	    	sc = new Scanner(new File(FILENAME));
	    	List<String> lines = new ArrayList<String>();
	    	
	    	while (sc.hasNextLine()) {
	      	  lines.add(sc.nextLine());
	      	}
	    	
	    	String[] output = lines.toArray(new String[0]);
	    	return output;
    	} catch (FileNotFoundException e) {
    		String[] error = {"e"};
        	//System.out.println("No hay géneros en el catálogo! ");
            //e.printStackTrace();
        	return error;
        }
    }
    
    /**
     * 
     * @param FILENAME
     * @return
     * @throws FileNotFoundException
     * a diferencia de muestraContenido() devuelve el 
     * resultado en arraylist de dos dimensiones
     * se utiliza para la lectura de las películas
     */
    public static List<List<String>> getContenido(String FILENAME) throws FileNotFoundException {

	        File file = new File(FILENAME);
	
	        // this gives you a 2-dimensional array of strings
	        List<List<String>> lines = new ArrayList<>();
	        Scanner inputStream;
	
	        /**
	         * crea scanner y recorre el archivo poniéndolo
	         * en un arraylist de 2d
	         * utiliza manejo de errores en el caso de que no
	         * se encuentre el archivo
	         */
	        try{
	            inputStream = new Scanner(file);
	
	            while(inputStream.hasNext()){
	                String line= inputStream.next();
	                String[] values = line.split(",");
	                // this adds the currently parsed line to the 2-dimensional string array
	                lines.add(Arrays.asList(values));
	            }
	
	            inputStream.close();
	            return lines;
	        }catch (FileNotFoundException e) {
	        	//System.out.println("No hay películas en el catálogo! ");
	            //e.printStackTrace();
	        	lines.add(Arrays.asList("e"));
	        	return lines;
	        }
	        
    }
    
}
