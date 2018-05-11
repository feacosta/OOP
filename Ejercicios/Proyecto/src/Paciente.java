/**
 * @jjshannon 
 * 20/6/17 
 */
import java.util.Scanner;//clase scanner
public class Paciente extends Sujeto
{
    //variables del doctor
    public Scanner ingresar;
    
    //constructor
    public Paciente()
    {
        System.out.println("Quien es el paciente");
        ingresar = new Scanner(System.in);
        setNombre();//Asignar nombre por herencia
        setApellido();//Asignar apellido por herencia
        setRut();//Asignar rut por herencia
    }
    //impresion info paciente
    public void imprimirPac()
    {
        System.out.println("Rut: "+rut);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);

    }
}
