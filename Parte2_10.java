import java.util.Scanner;

public class Parte2_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double notas[] = new double [5];
		
		System.out.println("Soma de notas");
		
		System.out.println("Informe a nota 1");
		notas[0] = input.nextDouble();
		
		System.out.println("Informe a nota 2");
		notas[1] = input.nextDouble();
		
		System.out.println("Informe a nota 3");
		notas[2] = input.nextDouble();
		
		System.out.println("Informe a nota 4");
		notas[3] = input.nextDouble();
		
		System.out.println("Informe a nota 5");
		notas[4] = input.nextDouble();
		
		double somaFinal = verArray (notas);
		System.out.println(somaFinal);
		
		

	}
	
	public static double verArray (double notas[]) {
		double somaNota = 0;
		
		for(int counter = 0; counter < notas.length ; counter++) {
			somaNota = somaNota + notas[counter];
			
			
			//somaNota = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
		}
		
		return somaNota;
	}
	
	

}
