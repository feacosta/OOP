
import java.util.Scanner;
public class Partition { 

    public static void partition(int n) {
        partition(n, n, "");
    }
    public static void partition(int n, int max, String prefix) {
        if (n == 0) {
        	System.out.println(prefix);
            return;
        }
  
        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i, prefix + " " + i);
        }
    }


    public static void main(String[] args) { 
    	
 // 	Scanner entrada = new Scanner(System.in);
 // 	entrada = new Scanner(System.in);
 // 	String variable;
 // 	System.out.print("Ingrese variable:");
 // 	variable = entrada.nextLine();
    	
        int n= Integer.parseInt(args[0]);
        partition(n);
    }

}