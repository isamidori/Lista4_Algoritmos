import java.util.Scanner;

public class Parte1_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int inicio = 0;
		int limite = 0;
		
		System.out.println("Informe um número inicial");
		inicio = input.nextInt();
		System.out.println("Informe o número final"); //limite
		limite = input.nextInt();
		
		verArray (inicio, limite);
		
	}

	public static void verArray (int inicio, int limite) {
		int[] array = new int [limite - inicio+1];
		
		for(int counter = 0 ; counter < array.length ; counter++) {
			array [counter] = counter + inicio;
			
		}
		
		for (int counter2: array) {
			System.out.println(counter2);
			
		}
	}
	
	
	
}
