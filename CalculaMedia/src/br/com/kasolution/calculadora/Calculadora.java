package br.com.kasolution.calculadora;

public class Calculadora {

	public static void main(String[] args) {
		
		int a[] = {10, 12, 9, 7, 15};
		double b[] = {10.5, 15.4, 12.8, 25.5, 12, 14, 18};
	
		double total_A = 0;
		for(int s : a) {
			
			total_A = s + total_A;
			//System.out.println("Soma A: " +total_A);
		}
		
		System.out.println("Total: " + total_A);
		
		double media_A = total_A/a.length;
		System.out.printf("A media da soma A e igual: %.2f\n", media_A);
		
		double total_B = 0;
		for(double s1 : b) {
			
			total_B = s1 + total_B;
			//System.out.println("Soma B: " + total_B);
		}
		
		System.out.println("Total: " + total_B);
		
		double media_B = total_B/b.length;
		System.out.printf("A media da soma B e igual: %.2f" , media_B);
		
		
		
	}

}
