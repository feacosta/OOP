package examen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author felipefuller
 *
 */

public class Main {
	private Scanner entrada;
	private VerPeliculas verPeliculas;
	private VerGeneros verGenero;
	private InsertarPelicula insertarPelicula;
	private InsertarGenero insertarGenero;
	private Escribir write;
	private VerGeneros genero;
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Main Main1;
		
		Main1 = new Main();
		
	}

	public Main() throws FileNotFoundException, IOException{
        Boolean repita;
        int opcion;
        
        String FILENAME_PELICULAS = "peliculas.txt";
        String FILENAME_GENEROS = "generos.txt";
        
        entrada = new Scanner(System.in);

        repita = true;
        while (repita)
        {
          System.out.println("Menú");        
          System.out.println("1. Ver películas disponibles");
          System.out.println("2. Ver géneros disponibles");
          System.out.println("3. Insertar película a catálogo");
          System.out.println("4. Insertar genero a catálogo");
          System.out.println("5. Salir");        
          // obteniendo la información...
          System.out.print("Ingrese Opción: ");
          opcion = entrada.nextByte();
          switch(opcion)
          {
          	   case 1: // ver peliculas disponibles
          		   	   verPeliculas = new VerPeliculas(FILENAME_PELICULAS);
		        	   break;
               case 2: // ver generos disponibles...
	        	   	   verGenero = new VerGeneros(FILENAME_GENEROS);
                       break;
               case 3: // ingresar pelicula...
            	   	   insertarPelicula = new InsertarPelicula("", FILENAME_PELICULAS, FILENAME_GENEROS);       
	                   break;
               case 4: // ingresar pelicula...
        	   	   	   insertarGenero = new InsertarGenero("", FILENAME_GENEROS);       
                   break;
               case 5: // salir...
	                   repita = false;
	                   System.out.println("Hasta la vista...");        
	                   break;
               default: // error...
                       System.out.println("Error, reintentar");         
          }
        }
	}
}
