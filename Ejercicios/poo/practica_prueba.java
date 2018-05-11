package practPrueba;

import java.util.Scanner;

public class Futbol {

	//Se definen las variables utilizadas en el constructor
	public int asistentes, resultadoClub1, resultadoClub2;
	public String estadio, ciudad, nombreClub1, nombreClub2;

	//Se define el constructor de la clase Futbol
	public Futbol( int asistentesPartido, String estadioPartido, String ciudadPartido, String nombreClub1Partido, String nombreClub2Partido, int resultadoClub1Partido, int resultadoClub2Partido) {
		asistentes = asistentesPartido;
		estadio = estadioPartido;
		ciudad = ciudadPartido;
		nombreClub1 = nombreClub1Partido;
		nombreClub2 = nombreClub2Partido;
		resultadoClub1 = resultadoClub1Partido;
		resultadoClub2 = resultadoClub2Partido;

	}

	//Se definen los setters
	public void setAsistentes(int nuevoAsistentes){
		asistentes = nuevoAsistentes;
	}

	public void setEstadio(String nuevoEstadio){
		estadio = nuevoEstadio;
	}

	public void setCiudad(String nuevaCiudad){
		ciudad = nuevaCiudad;
	}

	public void setNombreClub1(String nuevoNombreClub1){
		nombreClub1 = nuevoNombreClub1;
	}
    
	public void setNombreClub2(String nuevoNombreClub2){
		nombreClub2 = nuevoNombreClub2;
	}

	public void setResultadoClub1(int nuevoResultadoClub1){
		resultadoClub1 = nuevoResultadoClub1;
	}

	public void setResultadoClub2(int nuevoResultadoClub2){
		resultadoClub2 = nuevoResultadoClub2;
	}

	//Se definen los getters
	public int getAsistentes(){
		return asistentes;
	}

	public String getEstadio(){
		return estadio;
	}

	public String getCiudad(){
		return ciudad;
	}

	public String getNombreClub1(){
		return nombreClub1;
	}

	public String getNombreClub2(){
		return nombreClub2;
	}

	public int getResultadoClub1(){
		return resultadoClub1;
	}
	
	public int getResultadoClub2(){
		return resultadoClub2;
	}	

	//Se definen los metodos para leer los datos del usuario
    public static int readAsistentes() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese la capacidad de los asistentes: "); // Lee la capacidad de los asistentes de consola
        int readAsistentes = reader.nextInt();
        return readAsistentes;
    }

	public static String readEstadio() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese estadio: "); // Lee estadio de consola
        String readEstadio = reader.nextLine();
        return readEstadio;
    }

	public static String readCiudad() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese ciudad: "); // Lee ciudad de consola
        String readCiudad = reader.nextLine();
        return readCiudad;
    }

    public static String readNombreClub1() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese primer club: "); // Lee primer club de consola
        String readNombreClub1 = reader.nextLine();
        return readNombreClub1;
    }

    public static String readNombreClub2() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese segundo club: "); // Lee segundo club de consola
        String readNombreClub2 = reader.nextLine();
        return readNombreClub2;
    }

    public static int readResultadoClub1() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese el resultado del primer club: "); // Lee resultado primer club de consola
        int readResultadoClub1 = reader.nextInt();
        return readResultadoClub1;
    }
	
	public static int readResultadoClub2() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese el resultado del segundo club: "); // Lee resultado segundo club de consola
        int readResultadoClub2 = reader.nextInt();
        return readResultadoClub2;
    }

    public void printResultados() {
		System.out.println("---------------------------------------------");
    	System.out.println("Primer Club: " + this.getNombreClub1());
    	System.out.println("Segundo Club: " + this.getNombreClub2());
    	System.out.println("---------------------------------------------");
    	
    	if (this.getResultadoClub1() == 1) {
    		System.out.println(this.getNombreClub1() + " metió " + this.getResultadoClub1() + " gol");
    	} else if (this.getResultadoClub1() > 1) {
    		System.out.println(this.getNombreClub1() + " metió " + this.getResultadoClub1() + " goles");
    	} else {
    		System.out.println(this.getNombreClub1() + " no metió ningún gol");
    	}

    	if (this.getResultadoClub2() == 1) {
    		System.out.println(this.getNombreClub2() + " metió " + this.getResultadoClub2() + " gol");
    	} else if (this.getResultadoClub2() > 1) {
    		System.out.println(this.getNombreClub2() + " metió " + this.getResultadoClub2() + " goles");
    	} else {
    		System.out.println(this.getNombreClub2() + " no metió ningún gol");
    	}

    	if (this.getResultadoClub1() > this.getResultadoClub2()) {
    		System.out.println("Ganó " + this.getNombreClub1());
    	} else if (this.getResultadoClub1() < this.getResultadoClub2()){
    		System.out.println("Ganó " + this.getNombreClub2());
    	} else {
    		System.out.println("Empataron!");
    	}
    }

    //Metodo principal
	public static void main(String[] args) {  

		int asistentesPartido = readAsistentes();
		String estadioPartido = readEstadio();
		String ciudadPartido = readCiudad();
		String nombreClub1Partido = readNombreClub1();
		String nombreClub2Partido = readNombreClub2();
		int resultadoClub1Partido = readResultadoClub1();
		int resultadoClub2Partido = readResultadoClub2();

		Futbol futbol = new Futbol(asistentesPartido, estadioPartido, ciudadPartido, nombreClub1Partido, nombreClub2Partido, resultadoClub1Partido, resultadoClub2Partido);
		
		futbol.printResultados();
	}

}
	
