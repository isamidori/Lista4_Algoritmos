import java.util.Scanner;

public class Parte1_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int limite = 0;
		
		System.out.println("De 1 até limite");
		System.out.println("Informe um número");
		limite = input.nextInt();

		verArray(limite);

	}

	public static void verArray(int limite) {
		
		int[] array = new int[limite];
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = counter + 1;

		}
		
		

		for (int counter2:array) {
			System.out.println(counter2);
		}

	}

}



