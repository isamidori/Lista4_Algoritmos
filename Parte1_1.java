import java.util.Scanner;

public class Parte1_1 {

	public static void main(String[] args) {

		int[] numero = new int[] { 8, 2, 10, 5, 1 };
		
		verArray (numero);

	}

	public static void verArray(int[] numero) {

		for (int counter = 0; counter <= numero.length; counter++) {
			System.out.println(numero[counter]);
		}

	}

}
