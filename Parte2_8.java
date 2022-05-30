import java.util.Scanner;

public class Parte2_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[5];
		
		System.out.println("Maior nota");

		System.out.println("Informe a nota 1");
		array[0] = input.nextDouble();

		System.out.println("Informe a nota 2");
		array[1] = input.nextDouble();

		System.out.println("Informe a nota 3");
		array[2] = input.nextDouble();

		System.out.println("Informe a nota 4");
		array[3] = input.nextDouble();

		System.out.println("Informe a nota 5");
		array[4] = input.nextDouble();

		double verFinal = verArray (array);
		System.out.println("A maior nota é " + verFinal);
		

	}

	public static double verArray(double array[]) {
		double maiorNota = 0.0;

		for (int counter = 0; counter < array.length; counter++) {
			if (array[counter] > maiorNota) {
				maiorNota = array[counter];
			}
			
		}
		return maiorNota;
		//System.out.println(maiorNota);

	}
}


