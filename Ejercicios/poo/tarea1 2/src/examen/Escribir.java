package examen;

/**
 * 
 * @author felipefuller
 *
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escribir {
	
	public Escribir(String text, String FILENAME) {
	}
	
	public static void escribirArchivo(String text, String FILENAME) {
		/**
		 * verificamos si existe el archivo
		 */
		File varTmpDir = new File(FILENAME);
		boolean exists = varTmpDir.exists();
		//System.out.print(exists);
		
		/**
		 * Si existe archivo, escribimos al final
		 * Si no, lo creamos  
		 **/
		
		if (exists){
			try(FileWriter fw = new FileWriter(FILENAME, true);
				    BufferedWriter bw = new BufferedWriter(fw);
				    PrintWriter out = new PrintWriter(bw))
				{
					String capitalLetter = text.toUpperCase();
				    out.println(capitalLetter);
				    System.out.println("Listo! Se añadieron correctamente los datos.");
				} catch (IOException e) {
				    //exception handling left as an exercise for the reader
				}	
		}else{
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
				
				bw.write(text + "\n");
				// no need to close it.
				bw.close();
				
				System.out.println("Listo! Se añadieron correctamente los datos. Nuevo archivo creado");
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}	
		}
	}
}
