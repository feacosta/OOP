/* 
 * OUTPUT:
 * Menu de pila
 * 1. Agregar Elemento
 * 2. Sacar el último Elemento
 * 3. Mostrar Pila Completa
 * 4. Salir
 * Teclee la opcion
 * 
 * */


package p1;

import java.util.Scanner;

public class Pila {
 
    Scanner teclado = new Scanner(System.in);
    int pila1[]=new int[5];
    int tope=-1;
 
    public int push(){
 
        if(tope>=pila1.length-1){
            System.out.println("la pila está llena");
        }else
        {
            tope+=1;
            System.out.println("ingrese el dato");
            pila1[tope]=teclado.nextInt();
        }
        return tope;
 
    }
 
    public int pop(){
 
        if(tope==-1){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("Se elimino un elemento de la pila");
            pila1[tope]=0;
            tope=-1;
        }
        return tope;
    }
 
    public void ver(){
 
        for(int tope=4;tope>=0;tope--){
            System.out.println("Datos de la pila: "+pila1[tope]);
        }
 
    }
 
    public static void main(String[] args) {
 
        Pila objeto=new Pila();
 
        Scanner opcion = new Scanner(System.in);
        int seleccion;
 
        do
        {
 
          System.out.println("Menu de pila");//Creamos un menú sencillo para la pila
          System.out.println("1. Agregar Elemento");//Llamamos al método para insertar al tope
          System.out.println("2. Sacar el último Elemento");//Llamamos al método para sacar el tope de la pila
          System.out.println("3. Mostrar Pila Completa");//Ver la pila completa
          System.out.println("4. Salir");//Salir de nuestro pequeño menú principal
 
          System.out.println("Teclee la opcion");
          seleccion=opcion.nextInt();
 
          switch(seleccion){
              case 1:
                  objeto.push();
                  break;
              case 2:
                  objeto.pop();
                  break;
              case 3:
                  objeto.ver();
                  break;
              default:
                  System.out.println("Error\nOpcion invalida");
          }
 
        }while(seleccion!=4);
 
    }
}