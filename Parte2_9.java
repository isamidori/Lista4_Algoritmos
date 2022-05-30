import java.util.Scanner;

public class Parte2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double array[] = new double[5];
		
		System.out.println("Programa menor nota");
		
		System.out.println("Informe a nota 1");
		array [0] = input.nextDouble();
		
		System.out.println("Informe a nota 2");
		array[1] = input.nextDouble();
		
		System.out.println("Informe a nota 3");
		array[2] = input.nextDouble();
		
		System.out.println("Informe a nota 4");
		array [3] = input.nextDouble();
		
		System.out.println("Informe a nota 5");
		array [4] = input.nextDouble();
		
		
		double verFinal = verArray (array);
		System.out.println(verFinal);
		

	}

	public static double verArray (double array[]) {
		double menorNota = 10;
		
		for(int counter = 0 ; counter < array.length ; counter++) {
			if (array[0] < menorNota) {
				menorNota = array[0];
				
				
				
			}
			
		}
		
		return menorNota;
	}
	
	
}
