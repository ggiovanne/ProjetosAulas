package Dias;

import java.util.Scanner;

public class Dias {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d = 0;
		int m = 0;
		int a = 0;
		int totalDias;	
		
	System.out.println("VAMOS CONVERTER SUA IDADE EM DIAS: ");
	System.out.println("-----------------------------------");
	System.out.print ("Digite quantos anos você tem: ");
	a = sc.nextInt();
	System.out.print ("Digite quantos meses: ");
	m = sc.nextInt();	
	System.out.print ("Digite quantos dias: ");	
	d = sc.nextInt();
	
	totalDias = (a * 365) + (m * 30) + d;
	
	System.out.println(a + " anos, " + m + " meses, " + d + " dias= " + totalDias + " dias");
	
	}
}