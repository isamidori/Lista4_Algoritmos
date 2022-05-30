import java.util.Scanner;

public class Parte1_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int limite = 0;
		

		System.out.println("De 0 até limite");
		System.out.println("Informe um número");
		limite = input.nextInt();

		verArray(limite);

	}

	public static void verArray(int limite) {
		
		int[] array = new int[limite];
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = counter;

		}
		
		

		for (int counter2 = 0; counter2 < array.length; counter2++) {
			System.out.println(array[counter2]);
		}

	}

}
