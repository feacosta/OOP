/**
 * @jjshannon
 * @21/6/17
 */
import java.util.Scanner; //clase Scanner...
import java.io.BufferedReader;  // lee texto de una entrada de caracteres...
import java.io.FileReader;  // lee archivos...
import java.io.FileNotFoundException;  // manejar error de archivo no encontrado...
import java.io.IOException;  // Si se produce un error en la entrada/salida...

public class Leer
{
   
    public Leer(String datos) throws FileNotFoundException, IOException
    {
        //ejecucion funcion muestra contenido
        muestraContenido(datos);//lee archivo doctores
    }

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException
    {
        String cadena;
        FileReader MiArchivo = new FileReader(archivo);  //nuevo reader
        BufferedReader MiBuffer = new BufferedReader(MiArchivo); //nuevo buffer
        
        // leer el archivo hasta llegar al EOF...
        while((cadena = MiBuffer.readLine())!=null)
        {
            System.out.println(cadena); //imprimir cada linea
        }
        System.out.println("");
        MiBuffer.close();//cerrar el buffer
    }
}
