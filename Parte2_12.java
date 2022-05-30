import java.util.Arrays;
import java.util.Scanner;

public class Parte2_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double notas[] = new double[5];

		System.out.println("Segunda maior nota");

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

		double valorFinal = verArray(notas);
		System.out.println(valorFinal);

	}

	public static double verArray(double notas[]) {

		double segMaior;

		Arrays.sort(notas);
		segMaior = notas[notas.length-2];

		return segMaior;
		

	}

}
