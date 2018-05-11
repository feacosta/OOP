/**
 * @jjshannon 
 * 20/6/17 
 */
import java.util.Scanner; //clase Scanner...
import java.io.BufferedReader;  // lee texto de una entrada de caracteres...
import java.io.FileReader;  // lee archivos...
import java.io.FileNotFoundException;  // manejar error de archivo no encontrado...
import java.io.IOException;  // Si se produce un error en la entrada/salida...
public class Hora 
{
    //asignacion de varialbes
    public Paciente Pac;
    public Doctor Doc;
    public Leer Lee;
    public Escribir Escribe;
    public String hora, info;
    public int HoraAsNum;
    public Scanner ingresar;
    
    public static void main() throws FileNotFoundException, IOException
    {
        //funcion principal
        Hora Hora_1;
        System.out.println("Creacion de una hora medica");
        Hora_1 = new Hora(); //Creacion de una nueva clase Hora
    }
    public Hora() throws FileNotFoundException, IOException
    {
        Pac = new Paciente(); //creacion de un paciente
        Lee = new Leer("Doctores.txt");
        Doc = new Doctor(); //creacion de un doctor
        ingresar = new Scanner(System.in); //variable scanner
        setHora(); //creacion de la hora medica
        Imprimir();
        info = "Doctor: "+getNombreDoc()+" "+getApellidoDoc()+". Paciente: "+getNombrePac()+" "+getApellidoPac()+". A las "+HoraAsNum;
        Escribe = new Escribir(info,"HorasMedicas.txt"); //escribir en el txt
    }
    
    public void setHora()
    {
        boolean repita = true;
        while (repita)
        {
            try
            {
                System.out.println("Ingrese la hora medica");
                System.out.println("Las horas disponibles son entre 8am y 17pm");
                //asignacion de la hora desde un string a un int
                hora=ingresar.next();
                HoraAsNum=Integer.parseInt(hora);
                
                if (HoraAsNum>7 || HoraAsNum<18)//condicional para que se termine el while
                {
                    repita = false;
                }
                else if (HoraAsNum<7 || HoraAsNum>18) //error y reintentar por parte de usuario
                    System.out.println("La hora ingresada esta fuera del rango");
            }
            catch (NumberFormatException e)//excepcion de no ser un numero entero
            {
                System.out.println("El numero ingresado no es entero");
            }
        }
    }
    public int getHora() //funcion get de hora
    {
        return(HoraAsNum);
    }
    public String getNombrePac() //Obtener el nombre del paciente desde la clase paciente
    {
        return (Pac.getNombre());
    }
    public String getApellidoPac() //Obtener el apellido del paciente desde la clase paciente
    {
        return (Pac.getApellido());
    }
    public String getRutPac()//Obtener el rut del paciente desde la clase paciente
    {
        return (Pac.getRut());
    }
    public String getNombreDoc()//Obtener el nombre del paciente desde la clase paciente
    {
        return (Doc.getNombre());
    }
    public String getApellidoDoc()//Obtener el apellido del paciente desde la clase doctor
    {
        return (Doc.getApellido());
    }
    public void Imprimir() //funcion impresion para mostrar la hora medica
    {
        System.out.println(" ");
        System.out.println("HORA AGENDADA");
        System.out.println("Doctor: "+getNombreDoc()+" "+getApellidoDoc());
        System.out.println("Paciente: "+getNombrePac()+" "+getApellidoPac()+" "+ getRutPac());
        System.out.println("Hora: "+HoraAsNum);
        System.out.println(" ");
    }
}