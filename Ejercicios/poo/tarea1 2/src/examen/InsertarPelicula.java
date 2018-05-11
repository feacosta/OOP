package examen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InsertarPelicula extends Escribir {
	
	private static String nombre;
	private static String genero;
	private static String año;
	private static String director;
	private static String idioma;
	private static String pais;
	private String generoMayus;
	private String text;
	static Scanner entrada;
	
	public InsertarPelicula(String input, String FILENAME, String FILENAME_GENERO) throws IOException {
		super(input, FILENAME);
		
	    entrada = new Scanner(System.in);
	    
	    setNombre();
	    setGenero();
	    setAño();
	    setDirector();
	    setIdioma();
	    setPais();
		setPeliculas(generoMayus, FILENAME, FILENAME_GENERO);
	}
	
	public void setPeliculas(String generoMayus, String FILENAME, String FILENAME_GENERO) throws IOException{
		text = getNombre() + "," + generoMayus + "," + getAño() + "," + getDirector() + "," + getIdioma() + "," + getPais();
		Escribir.escribirArchivo(text, FILENAME);
		Boolean existe = existeGenero(generoMayus, FILENAME_GENERO);
		if (!existe) {
			Escribir.escribirArchivo(text, FILENAME_GENERO);
			System.out.println("Se agregó nuevo género al catálogo!");
		}
	}
	
	public void setNombre() {
        Boolean repita;
        
        repita = true;
        // obteniendo la información...
        while (repita)
        {
          System.out.println("Ingrese el nombre de la película: ");
          nombre = entrada.nextLine();
          if (nombre.length() > 0)
            repita = false;
          else
            System.out.println("Error, reintentar");         
        }
	}
	
	public void setGenero() {
        Boolean repita;
        repita = true;
        // obteniendo la información...
        while (repita)
        {
          System.out.println("Ingrese el genero de la película: ");
          genero = entrada.nextLine();
          if (genero.length() > 0) {
        	generoMayus = genero.toUpperCase();
            repita = false;
        } else
            System.out.println("Error, reintentar");         
        }
	}
	
	/**
	 * 
	 * @param checkGenero
	 * @param FILENAME
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * verifica si existe el genero, si no existe
	 * lo inserta en el archivo generos.txt
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
	
	public void setAño() {
        Boolean repita;
        
        repita = true;
        // obteniendo la información...
        while (repita)
        {
          System.out.println("Ingrese el año de la película: ");
          año = entrada.nextLine();
          if (año.length() > 0)
            repita = false;
          else
            System.out.println("Error, reintentar");         
        }
	}
	
	public void setDirector() {
        Boolean repita;
        
        repita = true;
        // obteniendo la información...
        while (repita)
        {
          System.out.println("Ingrese el director de la película: ");
          director = entrada.nextLine();
          if (director.length() > 0)
            repita = false;
          else
            System.out.println("Error, reintentar");         
        }
	}
	
	public void setIdioma() {
        Boolean repita;
        
        repita = true;
        // obteniendo la información...
        while (repita)
        {
          System.out.print("Ingrese el idioma de la película: ");
          idioma = entrada.nextLine();
          if (idioma.length() > 0)
            repita = false;
          else
            System.out.println("Error, reintentar");         
        }
	}
	
	public void setPais() {
        Boolean repita;
        
        repita = true;
        // obteniendo la información...
        while (repita)
        {
          System.out.println("Ingrese el país de la película: ");
          pais = entrada.nextLine();
          if (pais.length() > 0)
            repita = false;
          else
            System.out.println("Error, reintentar");         
        }
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}
	
	public String getGeneroMayus() {
		return generoMayus;
	}

	public String getAño() {
		return año;
	}

	public String getDirector() {
		return director;
	}

	public String getIdioma() {
		return idioma;
	}

	public String getPais() {
		return pais;
	}

}
