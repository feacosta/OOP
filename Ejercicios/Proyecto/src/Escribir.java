import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escribir 
{
	public Escribir(String datos, String NombreArchivo) {
		escribirArchivo(datos, NombreArchivo);
	}
	public static void escribirArchivo(String datos, String NombreArchivo)  
	{
	    try(FileWriter FILE = new FileWriter(NombreArchivo, true);
	    BufferedWriter BUFFER = new BufferedWriter(FILE);
	    PrintWriter out = new PrintWriter(BUFFER))
	    {
	        out.println(datos);
	        System.out.println("Listo! Se añadieron correctamente los datos.");
	    } catch (IOException e) 
	    {
	        
		}	
    }
}

