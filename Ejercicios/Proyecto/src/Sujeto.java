/**
 * @jjshannon 
 * @20/6/17 
 */
import java.util.Scanner;
public class Sujeto
{
    //Caracteristicas que tiene cada sujeto
    public String nombre, apellido, rut;
    public Scanner ingresar;

    public static void main()
    {
        //creacion de un sujeto
        Sujeto sujeto;
        System.out.println("Creando ficha");
        sujeto = new Sujeto();
    }

    public Sujeto()
    {
        ingresar = new Scanner(System.in);
    }
    //Creacion del nombre del sujeto
    public void setNombre()
    {
        Boolean repita;
        repita = true;
        // obteniendo la información...
        while (repita)
        {
            System.out.println("Ingrese nombre: ");
            nombre = ingresar.next();
            if (nombre.length() > 0)
                repita = false;
            else
                System.out.println("Error, retry");
        }
    }
    //Creacion del apellido del sujeto
    public void setApellido()
    {
        Boolean repita;
        repita = true;
        // obteniendo la información...
        while (repita)
        {
            System.out.println("Ingrese apellido: ");
            apellido = ingresar.next();
            if (apellido.length() > 0)
                repita = false;
            else
                System.out.println("Error, retry");
        }
    }
    //Creacion del rut de la persona
    public void setRut()
    {
        Boolean repita;
        short elsexo;
        String myrut;
        String[] ArrayStringRUT; // Declaro el array de tipo String []
        
        repita = true;
        // obteniendo la información...
        while (repita)
        {
          System.out.print("Ingrese RUT (con DV): ");
          myrut = ingresar.next();
          if (validarRut(myrut))
          {
            System.out.println("DV correcto");
            repita = false;
            rut = myrut;
          }
          else
          {
            System.out.println("DV incorrecto");
          }
        }
    }
    public static boolean validarRut(String elrut) 
    { 
        boolean validacion = false;
        int m = 0, s = 1;
        
        elrut = elrut.toUpperCase();    // todo a mayúscula...
        elrut = elrut.replace(".", ""); // eliminando puntos...
        elrut = elrut.replace("-", ""); // eliminando guiones...
        // separando la parte numérica...
        int rutAux = Integer.parseInt(elrut.substring(0, elrut.length() - 1));
        // separando el DV...
        char dv = elrut.charAt(elrut.length() - 1);
        
        for (; rutAux != 0; rutAux /= 10)
        {
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv == (char) (s != 0 ? s + 47 : 75)) 
        {
            validacion = true;
        }
        return validacion;
    }
    public String getNombre() //obtencion de nombre
    {
        return nombre;
    }
    public String getApellido()//obtencion de apellido
    {
        return apellido;
    }
    public String getRut()//obtencion de rut
    {
        return rut;
    }
}
