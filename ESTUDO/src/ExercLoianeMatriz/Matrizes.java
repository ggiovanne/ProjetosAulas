package ExercLoianeMatriz;

public class Matrizes {
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = new int[5];
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10;

		b = a;

	
		
		for (int i = 0; i < a.length ; i++) {
			System.out.println("Array A, posição " + (i + 1) + ": " + a[i]);
		}

		System.out.println("----------------------------------------------");
		
		for (int i = 0; i < b.length ; i++) {
			System.out.println("Array A, posição " + (i + 1) + ": " + a[i]);
		}

	}

}
