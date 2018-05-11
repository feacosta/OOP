package p2;

public class Elemento {
	
	public static void printArray(int[] a) {
		System.out.print(a[0]);
		for (int i = 1; i < a.length; i++) {
		System.out.print("/n" + a[i]);
		}
		System.out.println();
		}

}
