/**
 * @Juan Jose Shannon
 * @15/6/17
 */
import java.util.Scanner; //clase Scanner...
import java.io.BufferedReader;  // lee texto de una entrada de caracteres...
import java.io.FileReader;  // lee archivos...
import java.io.FileNotFoundException;  // manejar error de archivo no encontrado...
import java.io.IOException;  // Si se produce un error en la entrada/salida...
public class Consulta
{
    public Scanner entrada; //Asignacion del escaner con nombre de entrada
    //Vinculacion con las otras clases
    public Leer Lee;
    public Paciente Pac;
    public Doctor Doc;
    public Hora Hor;
    
    public static void main() throws FileNotFoundException, IOException
    {
        //principal
        Consulta Consulta_1;
        System.out.println("Comienza ejecucion del programa");
        Consulta_1 = new Consulta(); //Creacion de una nueva clase Consulta 
    }
    //Constructor para los objetos de la clase
    public Consulta() throws FileNotFoundException, IOException 
    {
        boolean repetir = true; //Variable booleana con condicion inicia TRUE
        int eleccion;
        entrada = new Scanner(System.in); //Scanner podra recibir datos
        while(repetir) //mientras la condicion repetir cumpla su condicion inicial
        {
            //menu del sistema
            System.out.println("Menu de la consulta");
            System.out.println("1. Crear doctor");
            System.out.println("2. Crear paciente");
            System.out.println("3. Agendar consulta medica");
            System.out.println("4. Ver doctores");
            System.out.println("5. Ver horas ya tomadas");
            System.out.println("6. Salir");
            //Recepcion de datos
            System.out.println("Ingrese opcion:");
            System.out.println(" ");
            eleccion = entrada.nextByte();
            switch(eleccion)
            {
                case 1: //crear consulta
                    Doc = new Doctor();
                    break;
                case 2: //crear paciente
                    Pac = new Paciente();
                    break;
                case 3: //agendar hora
                    Hor = new Hora();
                    break;
                case 4: //preguntar doctores
                    Lee = new Leer("Doctores.txt");
                    break;
                case 5://preguntar horas medicas
                    Lee = new Leer("HorasMedicas.txt");
                case 6: //Salir
                    repetir = false;
                    System.out.println("Hasta luego");        
                    break;
                default: // error...
                       System.out.println("Error, reintentar");         
            }
        }
    }
}
