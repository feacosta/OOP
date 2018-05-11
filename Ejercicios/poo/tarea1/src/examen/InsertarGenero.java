package examen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InsertarGenero extends Escribir {

	private String genero;
	private String generoMayus;
	static Scanner entrada;
	
	public InsertarGenero(String input, String FILENAME) throws FileNotFoundException, IOException {
		super(input, FILENAME);
	    entrada = new Scanner(System.in);
	    setGenero(FILENAME);
	    
	}
	
	public void setGenero(String FILENAME) throws FileNotFoundException, IOException {
        Boolean repita;
        
        repita = true;
        // obteniendo la información...
        while (repita)
        {
          System.out.print("Ingrese el género: ");
          genero = entrada.nextLine();
          generoMayus = genero.toUpperCase();
          if (generoMayus.length() > 0) {
        	  Boolean existe = existeGenero(generoMayus, FILENAME);
        	  if (!existe){
        		  repita = false;
        	  }
          } else 
            System.out.println("Error, reintentar");         
        }
	    Escribir.escribirArchivo(generoMayus, FILENAME);
	}
	
	/**
	 * 
	 * @param checkGenero
	 * @param FILENAME
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * verifica si existe el género, si existe,
	 * retorna un true
	 */
	public Boolean existeGenero(String checkGenero, String FILENAME) throws FileNotFoundException, IOException {
		Boolean existe = false;
		String[] output = Leer.muestraContenido(FILENAME);
		for (int i = 0; output.length > i; i++) {
			if ( output[i].equals(checkGenero) ) {
				System.out.println("El género ingresado ya existe!");
				existe = true;
				return existe;
			}
		}
		return existe;
	}
	public String getGenero() {
		return genero;
	}

}
