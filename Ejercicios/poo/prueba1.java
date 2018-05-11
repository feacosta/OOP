/*

Alumno: Felipe Fuller

*/


import java.util.Scanner;

public class Casa {

	//Se definen las variables utilizadas en el constructor
	public int numero, credito, tipo;
	public double valor;
	public boolean modo;
	public String codigo, direccion;

	//Se define el constructor de la clase Futbol
	public Casa(String codigoCasa, String direccionCasa, int numeroCasa, boolean modoCasa, double valorCasa, int creditoCasa, int tipoCasa) {
		codigo = codigoCasa;
		direccion = direccionCasa;
		numero = numeroCasa;
		modo = modoCasa;
		valor = valorCasa;
		credito = creditoCasa;
		tipo = tipoCasa;
	}

	//Se definen los setters
	public void setCodigo(String nuevoCodigo){
		codigo = nuevoCodigo;
	}

	public void setDireccion(String nuevoDireccion){
		direccion = nuevoDireccion;
	}

	public void setNumero(int nuevoNumero){
		numero = nuevoNumero;
	}

	public void setModo(boolean nuevoModo){
		modo = nuevoModo;
	}
    
	public void setValor(double nuevoValor){
		valor = nuevoValor;
	}

	public void setCredito(int nuevoCredito){
		credito = nuevoCredito;
	}

	public void setTipo(int nuevoTipo){
		tipo = nuevoTipo;
	}

	public void setPlusvalia(int porcentajePlusvalia) {
		valor = valor * (1 + (porcentajePlusvalia/100));
	}

	//Se definen los getters
	public String getCodigo(){
		return codigo;
	}

	public String getDireccion(){
		return direccion;
	}

	public int getNumero(){
		return numero;
	}

	public boolean getModo(){
		return modo;
	}

	public double getValor(){
		return valor;
	}

	public int getCredito(){
		return credito;
	}
	
	public int getTipo(){
		return tipo;
	}	

	//Se definen los metodos para leer los datos del usuario
    public static String readCodigo() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese el codigo de la casa (Ejemplo: A1001): "); // Lee el codigo de la casa de consola
        String readCodigo = reader.nextLine();
        return readCodigo;
    }

	public static String readDireccion() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese la direccion: "); // Lee la direccion de consola
        String readDireccion = reader.nextLine();
        return readDireccion;
    }
   
	public static int readNumero() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese el numero de la casa: "); // Lee el numero de la casa de consola
        //int readNumero = reader.nextInt();
        while (!reader.hasNextInt()) reader.next();
        int readNumero = reader.nextInt();
        return readNumero;
    }

    public static boolean readModo() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese el modo bunker (true: si lo es, false: si no lo es): "); // Lee el modo del bunker club de consola
        while (!reader.hasNextBoolean()) reader.next();
        boolean readModo = reader.nextBoolean();
/*        while (readModo != true || readModo != false ) {
        	System.out.println("Ingrese de forma correcta el modo bunker (true: si lo es, false: si no lo es): "); 
			readModo = reader.nextBoolean();
        }*/
        return readModo;
    }

    public static double readValor() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese el valor de la casa: "); // Lee el valor de la casa de consola
        while (!reader.hasNextDouble()) reader.next();
        double readValor = reader.nextDouble();
        return readValor;
    }

    public static int readCredito() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese la cantidad de creditos: "); // Lee la cantidad de creditos de consola
        while (!reader.hasNextInt()) reader.next();
	    int readCredito = reader.nextInt();
        return readCredito;
    }
	
	public static int readTipo() {
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Ingrese el tipo de casa (‘1’: 1 piso, ‘2’: 2 pisos): "); // Lee el tipo de casa de consola
        while (!reader.hasNextInt()) reader.next();
        int readTipo = reader.nextInt();
        return readTipo;
    }

    public void printResultados() {
		System.out.println("---------------------------------------------");
    	System.out.println("");
    	System.out.println("                   CASA                      ");
    	System.out.println("");
    	System.out.println("---------------------------------------------");
    	System.out.println("Codigo " + this.getCodigo() + "  $" + this.getValor() + "  pesos  " + this.getCredito() + " creditos");
    }

    //Metodo principal
	public static void main(String[] args) {  

		String codigoCasa = readCodigo();
		String direccionCasa = readDireccion();
		int numeroCasa = readNumero();
		boolean modoCasa = readModo();
		double valorCasa = readValor();
		int creditoCasa = readCredito();
		int tipoCasa = readTipo();

		Casa casa1 = new Casa(codigoCasa, direccionCasa, numeroCasa, modoCasa, valorCasa, creditoCasa, tipoCasa);

		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("Ingrese segunda casa ");
		System.out.println("");
		System.out.println("---------------------------------------------");

		String codigoCasa1 = readCodigo();
		String direccionCasa1 = readDireccion();
		int numeroCasa1 = readNumero();
		boolean modoCasa1 = readModo();
		double valorCasa1 = readValor();
		int creditoCasa1 = readCredito();
		int tipoCasa1 = readTipo();
		
		Casa casa2 = new Casa(codigoCasa1, direccionCasa1, numeroCasa1, modoCasa1, valorCasa1, creditoCasa1, tipoCasa1);
		
		casa1.printResultados();
		System.out.println("");
		System.out.println("");
		casa2.printResultados();
		
	}

}