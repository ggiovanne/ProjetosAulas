package Aul35Ex02;

public class Calculadora {
	
	static int somatorio (int num) {
		
		if (num < 1) {
			return 0;
		} 
		
		return num + somatorio(num-1);
	}
}
