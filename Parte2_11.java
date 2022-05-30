import java.util.Scanner;

public class Parte2_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double[] notas = new double[5];
		
		System.out.println("Média de nota");
				
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
		
		double mediaFinal = verArray (notas);
		System.out.println(mediaFinal);

	}
	
	public static double verArray (double[] notas) {
		double somaNota = 0;
		double mediaNota = 0;
		
		for(int counter = 0; counter < notas.length; counter++) {
			somaNota = somaNota + notas[counter];
			mediaNota = somaNota/notas.length;
			
		}
		
		return mediaNota;
		
	}

}
