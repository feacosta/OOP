/**
 * @jjshannon 
 * 20/6/17 
 */
import java.util.Scanner;//clase scanner
public class Doctor extends Sujeto
{
    //variables del doctor
    public Scanner ingresar;
    
    //constructor
    public Doctor()
    {
        System.out.println("Quen es el doctor?");
        ingresar = new Scanner(System.in);
        setNombre();//Asignar el nombre por herencia
        setApellido(); //Asignar apellido por herencia
    }
    //impresion info doc
    public void imprimirDoc()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
}

