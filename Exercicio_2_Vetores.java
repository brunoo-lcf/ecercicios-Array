package ARRAY;

import java.util.Scanner;

public class Exercicio_2_Vetores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] vet = new int[10];
		int impar = 0, par = 0, soma = 0;
		float media;

		for (int i = 0; i < vet.length; i++) {
			System.out.println("\nDigite um número: ");
			vet[i] = leia.nextInt();
			soma += vet[i];
		}

		System.out.println("\nElementos nos índices ímpares: ");

		for (int i = 0; i < vet.length; i++) {
			if (i % 2 != 0) {
				impar = vet[i];
				System.out.print(impar + " ");
			}
		}
		System.out.println("\nElementos pares: ");

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				par = vet[i];
				System.out.print(par + " ");
			}
		}
		System.out.println("\nSoma: " + soma);

		media = (float) soma / vet.length;

		System.out.printf("A média dos elementos é: %.2f", media);

	}

}
