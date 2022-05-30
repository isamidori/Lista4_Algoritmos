import java.util.Scanner;

public class Parte1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int limite = 0;

		System.out.println("Informe um numero");
		limite = input.nextInt();

		verArray(limite);

	}

	public static void verArray(int limite) {

		int[] array = new int[limite];
		for (int counter = 0; counter < limite; counter++) {
			array[counter] = limite - counter;
		}

		for (int counter2 : array) {
			System.out.println(counter2);

		}
	}

}
